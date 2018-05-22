sql-tutorial.ru
------------------------
Часть 1. Глава 1.8 Упражнение 71

topjava
-----------------------
- topjava. Lesson01 4.Maven

Что доделать
-----------------------

# Что надо посмотреть и разобрать

- <a href="https://habrahabr.ru/post/111189/">Знаешь ли ты JAVA, %username%?</a>
- <a href="https://habrahabr.ru/post/112674/">Знаешь ли ты JAVA, %username%? Часть вторая</a>
- <a href="https://habrahabr.ru/post/346628/">Путь запроса по внутренностям Spring Security</a>
- <a href="https://habrahabr.ru/post/134910/">Объекты Java</a>
- <a href="https://habrahabr.ru/company/luxoft/blog/280784/">Шпаргалка Java-программиста 6. Список полезных ссылок для Java программиста</a>
- <a href="https://habrahabr.ru/post/134102/">Размер Java объектов</a>
- <a href="https://habrahabr.ru/post/124909/">Сравнение потребления памяти у разных структур хранения данных</a>
- <a href="http://www.quizful.net/post/inner-classes-java">Внутренние классы в Java (inner classes java)</a>
- <a href="http://www.javenue.info/post/62">Исключительные ситуации в Java - exception и error</a>
- <a href="http://www.javenue.info/post/7">Анонимные классы в Java (anonymous inner classes)</a>
- <a href="http://www.javenue.info/post/java-modifiers-summary">Модификаторы в Java - обзор и примеры использования</a>
- <a href="http://www.javenue.info/post/91">Многопоточность. Wait / notify и приоритеты при захвате монитора. Spurious wakeups. Starvation.</a>
- <a href="http://www.javenue.info/post/design-patterns-java">Паттерны проектирования в Java</a>
- SQL
- Inner классы
- HashTable
- Исключения
- StringPool
- PostgreSQl
- Weak and soft references
- Класс Runtime
- JMX
- stream
- ORM
- Spring
- Java Concurent
- Java EE
- Git
- Maven
- Что такое web контейнер ?
- Что такое servlet ?
- http
- Монады
- Анонимные классы
- 

Вопросы с собеседований
- WEB(запросы, заголовки, сессия)
- Типы JOIN
- Индекс БД
- Отношеня в БД (многие ко многим, один ко многим, Многие к одному)

Книги
- Хорстман
- Блох

Обратить внимание
- amazon web services
- spring
- docker

Прочитанные книги
- SQL для простых смертных (книга не очень, старый стандарт)
- 

- сохранить ссылки с toplava главной страницы

Оформить в шпоргалки

- DISTINCT - исключить дублирующиеся значения;
- ALL - противоположно DISTINCT
- IN - полностью определяет множество, которому данное значение может принадлежать или не принадлежать (where SNUM in (1002, 1001, 1005))
- BETWEEN - задает границы множества (where COMM between .11 and .14)
- LIKE - используется для поиска подстрок, смотрит, входит ли заданная подстрока в указанное поле (where CNAME like 'G%s')
	- символ "подчеркивание" (_) - заменяет один любой символ
	- символ "процент" (%) - заменяет последовательность символов произвольной длинны, в том числе и нулевой
	- escape символ -  поиск слова начинающегося на 'P' и содержащее _ (where SNAME like 'P%/_%'escape'/')
- IS NULL - проверяет значение на NULL (where CITY is null)
- IS NOT NULL - проверят, что значение не NULL
- EXISTS - оператор генерирующий значение истина или лож (булевое значение), использует подзапросы. Фиксирует наличие данных в подзапросе
- ANI - 
- предикат с ALL - принимает значение истина, если каждое значение, в подзапросе, удовлетворяет условию внешнего подзапроса
- SOME - 
- UPDATE <название таблицы> SET <название столбца> <значение> wheare <предикат> - обновить данные в строке

			Агрегатные функции (select sum(AMT) from orders;)
			-------------------------------------------------

- COUNT - определяет количество строк или значений поля (не являющихся NULL)
- COUNT(DISTINCT) - подсчет различных значений данного поля (select count(distinct snum) from orders;)
- COUNT(*) - подсчет количества строк
- SUM - вычесляет сумму всех знвяений поля
- AVG - вычесляет среднее значение
- MAX - вычисляет наибольшее значение
- MIN - вычесляет наименьшее значение
- GROUP BY - позволяет определять подмножество значений отдельного поля в терминах другого поля (select SNUM, max(AMT) from orders group by SNUM;)
- HAVING - определяет критерий для исключения некоторых групп. Должно относится только к агрегатам и полям, выбранным по GROP BY
- ORDER BY - упорядочивает в соответствии со значениями одного или нескольуих столбцов (select * from orders order by ONUM desc)
- ASK - возрастающая последовательность
- DESC - убывающая последовательность
- allias - временная таблица
- Вложенные запросы select * from orders
	
			where SNUM = (	select SNUM from salespeople where SNAME = 'Motika');
- UNION - объединяет выходные данные двух или более запросов в единое множество строк и столбцов