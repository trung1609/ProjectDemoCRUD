create table users
(
    id                bigint auto_increment primary key,
    user_catalogue_id int          not null,
    name              varchar(50)  not null,
    email             varchar(255) not null unique,
    password          varchar(100) not null,
    phone             varchar(20)  not null unique,
    address           varchar(255) not null,
    image             varchar(255) default null,
    create_at         datetime     default current_timestamp,
    updated_at        datetime    default current_timestamp ON UPDATE CURRENT_TIMESTAMP,
    constraint fk_user_catalogue foreign key (user_catalogue_id) references users_catalogues (user_catalogue_id) on delete cascade

);
