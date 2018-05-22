Имеется следующий код:
````java
public class Overload{
    public void method(Object o) {
        System.out.println("Object");
    }
    public void method(java.io.FileNotFoundException f) {
        System.out.println("FileNotFoundException");
    }
    public void method(java.io.IOException i) {
        System.out.println("IOException");
    }
    public static void main(String args[]) {
        Overload test = new Overload();
        test.method(null);
    }
}
````

Результатом его компиляции и выполнения будет:
1) Ошибка компиляции
2) Ошибка времени выполнения
3) «Object»
4) «FileNotFoundException»
5) «IOException»

Расбор:
FileNotFoundException — последнее, о чем думаешь глядя на этот код.
Но на самом деле всё просто. Начнем с того, что в любой метод можно передать null.
А дальше компилятор выбирает наиболее <b>узкую</b> версию метода из возможных.
В данном случае <code>FileNotFoundException</code> это подкласс <code>IOException</code>,
который, в свою очередь, подкласс <code>Object</code>.
Поэтому компилятор выбирает именно данный метод.

Вот немного другая ситуация:
````java
class Overload1{
    public void method(Object o) {
        System.out.println("Object");
    }
    public void method(String s) {
        System.out.println("String");
    }
    public void method(StringBuffer sb) {
        System.out.println("StringBuffer");
    }
    public static void main(String args[]) {
        Overload1 test = new Overload1();
        test.method(null);
    }
}
````
На первый взгляд код почти такой же, но он даже не скомпилируется,
так как тут есть два метода на одном уровне иерархии,
и компилятор не может выбрать наиболее специфичный из них. 
