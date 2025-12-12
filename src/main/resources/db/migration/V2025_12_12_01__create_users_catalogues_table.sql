create table users_catalogues
(
    user_catalogue_id bigint auto_increment primary key,
    name              varchar(50) not null,
    create_at         timestamp default current_timestamp,
    updated_at        timestamp default current_timestamp
);
