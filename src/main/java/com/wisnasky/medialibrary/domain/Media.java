package com.wisnasky.medialibrary.domain;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="media_id")
    private Long id;
    @Column(name="media_title")
    private String title;
    @Column(name="media_creator")
    private String creator;
    //@Column(name="media_type_id")
    //private Long mediaTypeId;
}
