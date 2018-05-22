## Задача
Отсортировать список слов так, чтобы сначала шло какое-то фиксированное слово,
а потом все остальные в алфавитном порядке.
Если в списке два ключевого слова, то они должны быть вместе
 
### Решение
Решение задачи сводится к реализации функционального инетрфейса <code>Comparator</code>. 

Интрефейс <code>Comparator</code> содержит один метод <code>int compare(T o1, T o2)</code>, который
сравнивает два элемента. Метод возвращает числовое значение - если оно отрицательное, то объект о1 предшествует 
объекту о2, иначе - наоборот. А если метод возвращает ноль, то объекты равны.

Сложность в задаче - реализовать логику с фиксированным словом. В решении, если аргументом
<code>s1</code> приходит ключевое слово, то оно перемещается перед сравниваемым.
Если вторым аргументом <code>s2</code> приходит ключевое слово, оно тоже встает перед сравниваемым. 

````java
import java.util.Arrays;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "foo", "bar", "java", "hello");
        System.out.println(sort(strings, "hello"));
    }

    public static List<String> sort(List<String> strings, String keyWord) {
        strings.sort((s1, s2) -> {
            if (s1.equals(keyWord)) return -1;
            if (s2.equals(keyWord)) return 1;
            return s1.compareTo(s2);
        });
        return strings;
    }
}
````

Результат:
<code>

[hello, hello, bar, foo, java, world]
</code>