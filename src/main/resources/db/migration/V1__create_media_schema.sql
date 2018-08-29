create table media_library.media
(
  media_id    BIGINT auto_increment,
  media_title varchar(200) null,
  media_creator varchar (100) null,
  constraint MEDIA_media_id_uindex
  unique (media_id)
)
  comment 'Main table for the media library application.';

alter table media_library.media
  add primary key (media_id);