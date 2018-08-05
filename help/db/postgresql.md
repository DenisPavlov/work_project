- sudo -u postgres psql -c 'select now()' - проверить, будет ли работать БД
- sudo service postgresql - посмотреть доступные команды
- sudo journalctl -xeu postgresql - посмотеть лог
- sudo -u postgres psql - запустить psql

- psql
  - create database test; - создать БД test
  - \c  test - переключчиться на БД test
  - \? - посмотеть команды
  - create table courses(c_no text PRIMARY KEY, title text ); - создать таблицу
  - \help create table - попросить справку по команде create table
  - insert into courses (c_no, title, hours) values ('CS301', 'Базы данных', 30); - вставить данные в таблицу
  - SELECT title AS course_title, hours FROM courses ; - select запрос
  - 



Пользователи:
- postgres - от его имени работают процессы в psQL