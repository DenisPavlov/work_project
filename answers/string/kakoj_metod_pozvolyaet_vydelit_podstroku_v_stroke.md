В дополнении к «как получить часть строки» можно использовать метод <code>string.indexOf(char c)</code>, который вернет индекс первого вхождения символа.
Таким образом потом можно использовать этот номер для выделения подстроки с помощью <code>substring()</code>;

```java
public class Concat {
    public static void main(String[] args) {

        String line = "I am a java developer";
        String[] words = line.split(" ");
        String[] twoWords = line.split(" ", 2);

        System.out.println("String split with delimiter: "+Arrays.toString(words));//String split with delimiter: [I, am, a, java, developer]
        System.out.println("String split into two: "+Arrays.toString(twoWords));//String split into two: [I, am a java developer]

        //split string delimited with special characters

        String wordsWithNumbers = "I|am|a|java|developer";
        String[] numbers = wordsWithNumbers.split("\\|");

        System.out.println("String split with special character: "+ Arrays.toString(numbers));//String split with special character: [I, am, a, java, developer]
    }
}
```