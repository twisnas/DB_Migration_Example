package com.wisnasky.medialibrary.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
@Data
public class MediaType {

    //@Id
    private Long mediaTypeId;
    private String mediaTypeDesc;

}
