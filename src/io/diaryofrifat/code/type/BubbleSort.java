package io.diaryofrifat.code.type;

import static io.diaryofrifat.code.Utils.printArray;
import static io.diaryofrifat.code.Utils.swap;

public class BubbleSort {
    public static void doBubbleSort(int[] intArray) {
        doBubbleSortApproachOne(intArray);
        // doBubbleSortApproachTwo(intArray);

        printArray(intArray);
    }

    private static void doBubbleSortApproachOne(int[] intArray) {
        // Pushing the largest or the smallest number on the right side
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] < intArray[j + 1]) { // (>) : Small to Large & (<) : Large to Small
                    swap(intArray, j, j + 1);
                }
            }
        }
    }

    private static void doBubbleSortApproachTwo(int[] intArray) {
        // Pushing the largest or the smallest number on the left side
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = intArray.length - 1; j > i; j--) {
                if (intArray[j] < intArray[j - 1]) { // (<) : Small to Large & (>) : Large to Small
                    swap(intArray, j, j - 1);
                }
            }
        }
    }
}
