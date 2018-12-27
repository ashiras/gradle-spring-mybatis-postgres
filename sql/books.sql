docker exec -it postgres95 psql -U postgres

CREATE ROLE ashiras WITH LOGIN PASSWORD 'ASHIRAS';
CREATE DATABASE sample_db
    OWNER = ashiras;

docker exec -it postgres95 psql -U ashiras -d sample_db

DROP TABLE T_BOOKS;
CREATE TABLE T_BOOKS (
  name      VARCHAR(80) PRIMARY KEY,
  comments  VARCHAR(80) NOT NULL
);

insert into T_BOOKS values ('Angular', 'Angular の本');
insert into T_BOOKS values ('Spring boot', 'Spring boot の本');
