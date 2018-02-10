"Java Generics" - это технический термин, обозначающий набор свойств языка позволяющих определять и использовать обобщенные типы и методы. Обобщенные типы или методы отличаются от обычных тем, что имеют типизированные параметры.

Примером дженериков или обобщенных типов может служить библитека с коллекциями в Java. Например, класс <code>LinkedList&lt;E&gt;</code> - типичный обобщенный тип. Он содержит параметр E, который представляет тип элементов, которые будут храниться в коллекции. Вместо того, чтобы просто использовать LinkedList, ничего не говоря о типе элемента в списке, мы можем использовать <code>LinkedList&lt;String&gt;</code> или <code>LinkedList&lt;Integer&gt;</code>. Создание объектов обобщенных типов происходит посредством замены параметризированных типов реальными типами данных. Класс типа <code>LinkedList&lt;E&gt;</code> - обобщенный тип, который содержит параметр E. Создание объектов, типа <code>LinkedList&lt;String&gt;</code> или <code>LinkedList&lt;Integer&gt;</code> называются параметризированными типами, а String и Integer - реальные типы аргументов.