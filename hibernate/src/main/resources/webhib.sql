set search_path to webhib; -- перейти на нужную схему

create table items (id bigserial, title varchar(255), price int, primary key (id));

create table users_details (id bigserial primary key, email varchar(255), city varchar(255));
insert into users_details (email, city) values ('bod@gmail.com', 'New York');

create table users (id bigserial primary key, name varchar(255), details_id bigint, foreign key (details_id) references users_details(id));
insert into users (name, details_id) values ('bob', 1);

create table universities (id bigserial primary key, name varchar(255));
insert into universities (name) values ('NGTU'), ('SIBGUTI');

create table students (id bigserial primary key, name varchar(255), university_id bigint references universities(id));
insert into students (name, university_id) VALUES ('Denis', 1), ('Anna', 1), ('Anton', 2);

create table books (id bigserial primary key, title varchar(255));
insert into books (title) values ('Война и мир'), ('Мастер и маргарита'), ('Детство'), ('Стихи'), ('Математика');

create table readers (id bigserial primary key , name varchar(255));
insert into readers (name) values ('Denis'), ('Anna'), ('Anton');

create table book_readers (reader_id bigint, book_id bigint, foreign key (book_id) references books(id), foreign key (reader_id) references readers(id));
insert into book_readers (reader_id, book_id) VALUES
(1, 1), (1, 2), (1, 3),
(2, 2), (2, 4),
(3, 4), (3, 5);

select * from items;
select * from users_details;
select * from users;
select * from universities;
select * from students;
select * from books;
select * from readers;

select u.name, ud.email, ud.city from users u
left join users_details ud on u.details_id = ud.id;

select s.name, u.name from students s left join universities u on s.university_id = u.id;

select r.name, b.title from readers r
    join book_readers br on r.id = br.reader_id
    join books b on br.book_id = b.id;