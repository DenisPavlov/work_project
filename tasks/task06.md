Дана сигнатура метода:
````java
public static <E extends CharSequence> List<? super E> doIt(List<E> nums)
```` 
Который вызывается как-то так:
````java
result = doIt(in);
````