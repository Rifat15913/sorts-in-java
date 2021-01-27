package io.diaryofrifat.code;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                }
            }
        }

        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
