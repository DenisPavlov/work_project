- sudo -u postgres psql -c 'select now()' - проверить, будет ли работать БД
- sudo service postgresql - посмотреть доступные команды
- sudo journalctl -xeu postgresql - посмотеть лог
- sudo -u postgres psql - запустить psql

##Установка 
- sudo apt-get update
- sudo apt-get install postgresql postgresql-contrib

### создание базы и юзера
- sudo -u postgres psql
- CREATE DATABASE topjava;
- CREATE USER "user" WITH password 'password';
- GRANT ALL PRIVILEGES ON DATABASE topjava TO "user";

## psql
### Команды
- \? - посмотеть команды
- \h - справка по SQL
- \x - переключает обычный табличный вывод на расширенный
- \l - список баз данных
- \du - список пользователей
- \dt - список таблиц
- \di - список индексов
- \dv - список представлений
- \df - список функций
- \dn - список схем
- \dx - список установленных расширений
- \dp - список привелегий
- \d имя - какие поля определены в таблице
- \d+ имя - более подробная информация
- \timing on - показывает время выполнения операторов
- \c  test - переключчиться на БД test
- \d - посмотреть какие таблицы есть в БД
- \q - завершить сеанс
- create database test; - создать БД test
- create user test with password 'test'; - создать пользователя test
- GRANT ALL ON DATABASE test TO test; - дать права юзеру на БД

  - create table courses(c_no text PRIMARY KEY, title text ); - создать таблицу
  - \help create table - попросить справку по команде create table
  - insert into courses (c_no, title, hours) values ('CS301', 'Базы данных', 30); - вставить данные в таблицу
  - SELECT title AS course_title, hours FROM courses ; - select запрос
  


Пользователи:
- postgres - от его имени работают процессы в psQL

Переключиться на нужную схему
- set search_path to webhib;