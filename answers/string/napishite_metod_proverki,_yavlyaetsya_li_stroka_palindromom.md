Строка называется палиндромом, если она одинаково читается в обоих направлениях.
К примеру “аба” является строкой-палиндромом.

Класс <code>String</code> не предоставляет никакого метода для реверса строки, зато классы <code>StringBuffer</code> и <code>StringBuilder</code> имеют метод реверсирования,
при помощи которого мы можем проверить, является ли наша строка палиндромом или нет.
````java
    private static boolean isPalindrome(String str) {
        if (str == null) return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
````    
Иногда собеседующий может попросить не использовать другие классы для этой проверки, в таком случае мы можем сравнивать символы в строке с обоих сторон для проверки на палиндром.
````java
    private static boolean isPalindromeString(String str) {
        if (str == null) return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
````