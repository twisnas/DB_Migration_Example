create table media_library.media_type
(
  media_type_id    BIGINT auto_increment,
  media_type_desc varchar(200) null,
  constraint MEDIA_media_type_id_uindex
  unique (media_type_id)
)
  comment 'Main table for the media library application.';

alter table media_library.media_type
  add primary key (media_type_id);