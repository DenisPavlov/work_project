Это ежедневный вопрос, встающий из-за популярности применения String и Enum в разработке приложений Java.
Лучший способ преобразовать Enum в String, это определить фабричный метод в самом Enum, который будет брать аргументы String и возвращать в качестве Enum.
Вы так же можете пожелать игнорировать регистр.

```java
public class StringToEnum {
    private enum Currency {USD, AUD, GBP, EURO }

    public static void main(String args[]) {

        //Converting String to Enum in Java
        String usd = "USD";

        //Enum to String using Enum.valueOf()
        Enum currency = Enum.valueOf(Currency.class, usd);

        //Enum to String using Currency.valueOf()
        currency = Currency.valueOf(usd);

        System.out.println("String to Enum Example : " + currency);

        //This Enum to String conversion will throw Exception
        String INR = "INR";
        //java.lang.IllegalArgumentException: No enum const class
        Currency rupee = Currency.valueOf("INR");
        
        //This Enum to String conversion will throw Exception
        String nul = null;

        //NPE
        Currency curr = Currency.valueOf(nul);
    }
}
```