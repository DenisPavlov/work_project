package tasks;

public class Task02 {
    public static void main(String[] args) {
        Float f1 = new Float(Float.NaN);
        Float f2 = new Float(Float.NaN);
        System.out.println( ""+ (f1 == f2)+" "+f1.equals(f2)+ " "+(Float.NaN == Float.NaN) );
    }
}
