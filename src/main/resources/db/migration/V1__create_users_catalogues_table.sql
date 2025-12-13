create table users_catalogues
(
    id serial primary key,
    name              varchar(50) not null,
    create_at         timestamp default current_timestamp,
    updated_at        timestamp default current_timestamp
);
