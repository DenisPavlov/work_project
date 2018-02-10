package answers.core.equalsAndHashCode;

public class Main {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer ii = new Integer(10);
        System.out.println(i.equals(ii));

        Integer n = null;
//        System.out.println(n.equals(null)); //NullPointerException

        System.out.println(i.equals(null));
    }
}
