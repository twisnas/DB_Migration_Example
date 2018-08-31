package com.wisnasky.medialibrary.controller;

import com.wisnasky.medialibrary.domain.Media;
import com.wisnasky.medialibrary.respository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MediaController {

    @Autowired
    private MediaRepository mediaRepository;

    @GetMapping("/media/{mediaId}")
    public Media media(@PathVariable("mediaId") Long media) throws Exception {
        if(media != null){
            return mediaRepository.findById(media).get();
        }
        throw new Exception("Invalid request");
    }

    @PostMapping("/media")
    public ResponseEntity<Long> add(@RequestParam String title, @RequestParam String creator/*, @RequestParam Long mediaTypeId*/){
        Media media = new Media();
        media.setTitle(title);
        media.setCreator(creator);
        //media.setMediaTypeId(mediaTypeId);
        media = mediaRepository.save(media);
        return new ResponseEntity<>(media.getId(), HttpStatus.OK);
    }

    @DeleteMapping("/media/{mediaId}")
    public ResponseEntity<Void> delete(@PathVariable("mediaId") Long mediaId){
        if(mediaRepository.existsById(mediaId)) {
            mediaRepository.deleteById(mediaId);
        }
        return ResponseEntity.ok().build();
    }
}
