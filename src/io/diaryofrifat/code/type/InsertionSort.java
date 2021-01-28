package io.diaryofrifat.code.type;

import static io.diaryofrifat.code.Utils.printArray;

public class InsertionSort {
    public static void sort(int[] intArray) {
        for (int i = 1; i < intArray.length; i++) {
            int currentElement = intArray[i];

            int j;

            for (j = i; j > 0 && intArray[j - 1] > currentElement; j--) {
                intArray[j] = intArray[j - 1];
            }

            intArray[j] = currentElement;
        }

        printArray(intArray);
    }
}
