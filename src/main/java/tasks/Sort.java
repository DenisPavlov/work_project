package tasks;

import java.util.Arrays;
import java.util.List;

/**
 * Отсортировать список слов так, чтобы сначала шло какое-то фиксированное слово,
 * а потом все остальные в алфавитном порядке.
 * Если в списке два ключевого слова, то они должны быть вместе
 */

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
