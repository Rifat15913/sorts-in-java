package io.diaryofrifat.code;

public class Utils {
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] intArray) {
        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }
}
