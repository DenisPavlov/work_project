package answers.core.strings;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.getProperties;

public class Main {
    public static void main(String[] args) {

        //КОНСТРУКТОРЫ
//        String habr = "habrahabr";
//        System.out.println(habr);

//        char[] habrAsArrayOfChars = {'h', 'a', 'b', 'r', 'a', 'h', 'a', 'b', 'r'};
//        byte[] habrAsArrayOfBytes = {104, 97, 98, 114, 97, 104, 97, 98, 114};

//        String first = new String();
//        System.out.println(first);
//        String second = new String(habr);
//        System.out.println(second);

//        String third = new String(habrAsArrayOfChars); // "habrahabr"
//        System.out.println(third);
//        String fourth = new String(habrAsArrayOfChars, 0, 4); // "habr"
//        System.out.println(fourth);

//        String fifth = new String(habrAsArrayOfBytes, Charset.forName("UTF-16BE")); // кодировка нам явно не подходит "桡扲慨慢�"
//        System.out.println(fifth);

//        String sixth = new String(new StringBuffer(habr));
//        String seventh = new String(new StringBuilder(habr));
//        System.out.println(sixth);
//        System.out.println(seventh);

        //ДЛИННА
//        String habr = "habrahabr";
        // получить длину строки
//        int length = habr.length();
//        // теперь можно узнать есть ли символ символ 'h' в "habrahabr"
//        char searchChar = 'h';
//        boolean isFound = false;
//        for (int i = 0; i < length; ++i) {
//            if (habr.charAt(i) == searchChar) {
//                isFound = true;
//                break; // первое вхождение
//            }
//        }
//        System.out.println(message(isFound)); // Your char had been found!
        // ой, забыл, есть же метод indexOf
//        System.out.println(message(habr.indexOf(searchChar) != -1)); // Your char had been found!

        //КОНКАТЕНАЦИЯ
//        String javaHub = "habrhabr".concat(".ru").concat("/hub").concat("/java");
//        System.out.println(javaHub); // получим "habrhabr.ru/hub/java"
        // перепишем наш метод используя concat

//        String habr = "habra" + "habr"; // "habrahabr"
//        habr += ".ru"; // "habrahabr.ru"
//        System.out.println(habr);

//        String string = null;
//        string += " habrahabr"; // null преобразуется в "null", в результате "null habrahabr"
//        System.out.println(string);
//        string = null;
//        string.concat("s"); // логично что NullPointerException

        //ФОРМАТИРОВАНИЕ
//        String formatString = "We are printing double variable (%f), string ('%s') and integer variable (%d).";
//        System.out.println(String.format(formatString, 2.3, "habr", 10));
        // We are printing double variable (2.300000), string ('habr') and integer variable (10).

        //МЕТОДЫ
//        String hello = "Hello";
//        String habr = "habrahabr";
//        String delimiter = ", ";
//
//        System.out.println(String.join(delimiter, hello, habr));
//        // или так
//        System.out.println(String.join(delimiter, new ArrayList<CharSequence>(Arrays.asList(hello, habr, "ELLO", "HABR"))));
//        // в обоих случаях "Hello, habrahabr"

        //ПРЕОБРАЗОВАНИЕ
//        int integerVariable = 10;
//        String first = integerVariable + ""; // конкатенация с пустой строкой
//        String second = String.valueOf(integerVariable); // вызов статического метода valueOf класса String
//        String third = Integer.toString(integerVariable); // вызов метода toString класса-обертки

//        String string = "10";
//        int first = Integer.parseInt(string);
/*
   получаем примитивный тип (primitive type)
   используя метод parseXхх нужного класса-обертки,
   где Xxx - имя примитива с заглавной буквы (например parseInt)
*/
//        int second = Integer.valueOf(string); // получаем объект wrapper класса и автоматически распаковываем

        //StringBuffer

        //Создание
//        StringBuffer firstBuffer = new StringBuffer(); // capacity = 16
//        StringBuffer secondBuffer = new StringBuffer("habrahabr"); // capacity = str.length() + 16
//        StringBuffer thirdBuffer = new StringBuffer(secondBuffer); // параметр - любой класс, что реализует CharSequence
//        StringBuffer fourthBuffer = new StringBuffer(50); // передаем capacity

        //Модификация
        String domain = ".ru";
// создадим буфер с помощью String объекта
        StringBuffer buffer = new StringBuffer("habrahabr"); // "habrahabr"
// вставим домен в конец
        buffer.append(domain); // "habrahabr.ru"
        System.out.println(buffer.toString());
// удалим домен
        buffer.delete(buffer.length() - domain.length(), buffer.length()); // "habrahabr"
        System.out.println(buffer.toString());
// вставим домен в конец на этот раз используя insert
        buffer.insert(buffer.length(), domain); // "habrahabr.ru"
        System.out.println(buffer.toString());
    }

    private static String message(boolean b) {
        return "Your char had".concat(b ? " " : "n't ") .concat("been found!");
    }

}

class Test {
    public static void main(String[] args) {
//        try {
//            test(new StringBuffer("")); // StringBuffer: 35117ms.
//            test(new StringBuilder("")); // StringBuilder: 3358ms.
//        } catch (java.io.IOException e) {
//            System.err.println(e.getMessage());
//        }
//        System.getProperties().forEach((a, b) -> {
//            System.out.println(a + ": " + b);
//        } );
        try {
            InputStream stream = Runtime.getRuntime().exec("lshw -class cpu ").getInputStream();
            Scanner scanner = new Scanner(stream);
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void test(Appendable obj) throws java.io.IOException {
        // узнаем текущее время до теста
        long before = System.currentTimeMillis();
        for (int i = 0; i++ < 1e9; ) {
            obj.append("");
        }
        // узнаем текущее время после теста
        long after = System.currentTimeMillis();
        // выводим результат
        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }
}
