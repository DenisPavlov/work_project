package courses.stepic;

import java.math.BigInteger;
import java.util.Arrays;

public class Factorial {
    public static BigInteger factorial(int value) {
        if (value == 1) return new BigInteger("1");
        else {
            BigInteger current = BigInteger.valueOf(value);
            return current.multiply(factorial(value-1));
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int i = 0, j = 0;
        int[] res = new int[a1.length + a2.length];

        while (i < a1.length && j < a2.length)
            res[i + j] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
        while (i < a1.length)
            res[i + j] = a1[i++];
        while (j < a2.length)
            res[i + j] = a2[j++];
        return res;
    }

    public static void main(String[] args) {

        //System.out.println(factorial(1)); //1
        //System.out.println(factorial(3)); //6

        int[] a1 = {0, 2, 2, 10,10,20};
        int[] a2 = {1, 3, 5, 7, 8,10,10};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }
}
