create table users
(
    id                serial primary key,
    user_catalogue_id int not null,
    name              varchar(50)  not null,
    email             varchar(255) not null unique,
    password          varchar(100) not null,
    phone             varchar(20)  not null unique,
    address           varchar(255) not null,
    image             varchar(255) default null,
    create_at         date     default current_timestamp,
    updated_at        date    default current_timestamp,
    constraint fk_user_catalogue foreign key (user_catalogue_id) references users_catalogues (id) on delete cascade

);
