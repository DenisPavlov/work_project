package study.semester1;

import java.util.Arrays;

public class HeapSort1 {
    public static void main(String[] args) {
        int[] arr = {24, 31, -15, 20, 52, 6, 12, 44};
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            pros(arr, i);
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }

    //просеивание кучи
    public static void pros(int[] arr, int elemIndex) {

        int length = elemIndex;

        while (elemIndex >= 0) {
            int left = elemIndex * 2 + 1;
            int right = elemIndex * 2 + 2;
            int min = elemIndex;

            if (left < length && arr[left] > arr[min]) {
                min = left;
            }

            if (right < length && arr[right] > arr[min]) {
                min = right;
            }

            if (min != elemIndex) {
                int tmp = arr[elemIndex];
                arr[elemIndex] = arr[min];
                arr[min] = tmp;
            }
            elemIndex--;
        }
    }
}