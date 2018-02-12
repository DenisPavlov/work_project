package answers.core.enums;

/**
 * Java program for creating Enum instance from String in Java.
 * This program demonstrate how to use Enum.valueOf() method to convert enum instance
 * into String. beware that String must be same as declared Enum instances and they are
 * case sensitive as well. "UsD" instead of "USD" will throw IllegalArgumentException
 *
 */
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