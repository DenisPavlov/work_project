package study.semester1;

import java.util.Arrays;

public class MergeSort {
    /**
     * Слияние двух списков
     * @param a список элементов
     * @param b список элементов
     */
    public static int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];
        int resultIndex = 0;
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex < a.length && bIndex < b.length) {

            int aa = a[aIndex];
            int bb = b[bIndex];

            if (aa <= bb) {
                result[resultIndex++] = aa;
                aIndex++;
            } else {
                result[resultIndex++] = bb;
                bIndex++;
            }

            //если один из источников достиг последнего элемента, заполнить результат остатками другого источника
            if (bIndex == b.length) {
                fill(aIndex, a, result, resultIndex);
            }
            if (aIndex == a.length) {
                fill(bIndex, b, result, resultIndex);
            }
        }

        return result;
    }

    public static void fill(int index, int[] from, int[] to, int start) {
        for (int i = index; i < from.length; i++) {
            to[start++] = from[i];
        }
    }

    public static int[] mergeSort(int[] a) {
        if (a.length < 2) {
            return a;
        }

        int[] sortedLeft = mergeSort(left(a));
        int[] sortRight = mergeSort(right(a));

        return merge(sortedLeft, sortRight);

        //return null;
    }

    public static int[] left(int[] a ) {
        int length = a.length / 2;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = a[i];
        }
        return result;
    }

    public static int[] right(int[] a) {
        int start = a.length / 2;
        int[] result = new int[a.length-start];
        int j = 0;
        for (int i = start; i < a.length; i++) {
            result[j++] = a[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = {1, 33, 4, 2, 9, 5, 88, 43, 52, 21, 11, 45, 91, 2, 1};
        System.out.println("before sorting: " + Arrays.toString(a));
        int[] merge = mergeSort(a);
        String result = Arrays.toString(merge);
        System.out.println("after sorting: " + result);

    }
}
