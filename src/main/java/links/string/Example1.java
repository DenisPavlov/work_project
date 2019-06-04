package links.string;

public class Example1 {
    public static void main(String[] args) {
        String strObject = new String("Java");
        String strLiteral = "Java";
        String strLiteral1 = "Java";
        System.out.println(strLiteral == strObject);
        System.out.println(strLiteral == strLiteral1);
        System.out.println(strLiteral.equals(strObject));
    }
}
