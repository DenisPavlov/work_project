Да, можно создать новый экземпляр класса, пока его <code>static synchronized</code> метод выполняется.

Мои рассуждения: статик методы классов создаются в единственном экземпляре во время загрузки класса класслоадером и принадлежат объекту <code>Class.MyClass</code>. 
Во время выполнения в потоке <code>static synchronized</code> метода захватывается блокировка именно этого объекта. Следовательно нам ни что не мешает создать новый экземпляр класса.
Загрузчиков может быть несколько, соответственно, экземпляров <code>Class<MyClass></code> — тоже несколько, по одному на загрузчик. Создавать новые инстанции ничего не мешает, т.к. это типа выделение машиной памяти под объект и вызов метода <init>, который не synchronized.

