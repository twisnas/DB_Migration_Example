package com.wisnasky.medialibrary.respository;

import com.wisnasky.medialibrary.domain.Media;
import org.springframework.data.repository.CrudRepository;

public interface MediaRepository extends CrudRepository<Media, Long> {
}
