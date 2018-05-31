Дана сигнатура метода:
````java
public static <E extends CharSequence> List<? super E> doIt(List<E> nums)
```` 
Который вызывается как-то так:
````java
result = doIt(in);
````
Какого типа должны быть <code>result</code> и <code>in</code>

1) <code>ArrayList<String> in; List<CharSequence> result;</code>
2) <code>List<String> in; List<Object> result;</code>
3)<code>ArrayList<String> in; List result;</code>
4)<code>List<CharSequence> in; List<CharSequence> result;</code>
5)<code>ArrayList<Object> in; List<CharSequence> result;</code>

Решение:

Входной параметр был описан как <code>List\<E></code>, где <code>E</code> — это какой-то класс, наследующий <code>CharSequence</code>.
Таким образом <code>ArrayList\<String> </code>, <code>List\<String></code>, или <code>List\<CharSequence></code> — подходящие варианты для 'in'. 

Данный метод возвращает <code>List<? super E></code>, что значит, что это <code>List</code>, содержащий какой-то суперкласс <code>E</code>.
Притом, <code>E</code> будет привязано к типу, который используется для 'in'. 
Например, если вы объявили <code>ArrayList\<String></code> in, <code>E</code> будет типа <code>String</code>. 

Важный момент, который нужно понять, что невозможно заранее определить, что вернет метод. То есть вы не можете тут указать ни один из Java-классов, даже <code>Object</code>. 

Единственный возможный вариант — использовать нетипизированный список, например: <code>List result</code>.