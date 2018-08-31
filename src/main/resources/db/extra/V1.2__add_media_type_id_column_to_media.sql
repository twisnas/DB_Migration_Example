ALTER TABLE media ADD media_type_id bigint(20) NULL;
ALTER TABLE media
ADD CONSTRAINT media_type_id_fk
FOREIGN KEY (media_type_id) REFERENCES media_type (media_type_id);