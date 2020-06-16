create table users (
    id bigserial,
    username varchar(30) not null,
    password varchar(80),
    email varchar(50) unique,
    primary key (id)
);

create table roles (
    id serial,
    name varchar(50) not null,
    primary key (id)
);

create table user_roles(
    user_id bigint not null,
    role_id int not null,
    primary key (user_id, role_id),
    foreign key (user_id) references users(id),
    foreign key (role_id) references roles(id)
);

insert into roles (name) values
('ROLE_USER'), ('ROLE_ADMIN');

insert into users(username, password, email) VALUES
('admin', '$2y$12$RTHepikXBOizC8iH0FZVUOMr3oKcfhnPY7XS.UMVdkyh8KDCVF6uS', 'admin@gmail.com');

insert into user_roles(user_id, role_id) VALUES (2,2);

select * from users
    LEFT JOIN user_roles ur on users.id = ur.user_id
    LEFT JOIN roles r on ur.role_id = r.id;


