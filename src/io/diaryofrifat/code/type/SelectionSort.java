package io.diaryofrifat.code.type;

import static io.diaryofrifat.code.Utils.printArray;
import static io.diaryofrifat.code.Utils.swap;

public class SelectionSort {
    public static void doSelectionSort(int[] intArray) {
        doSelectionSortApproachOne(intArray);
        // doSelectionSortApproachTwo(intArray);

        printArray(intArray);
    }

    private static void doSelectionSortApproachOne(int[] intArray) {
        // Pushing the largest or the smallest number on the right side
        for (int i = intArray.length - 1; i > 0; i--) {
            int largest = 0;

            for (int j = 1; j <= i; j++) {
                if (intArray[j] > intArray[largest]) { // (>) : Small to Large & (<) : Large to Small
                    largest = j;
                }
            }

            swap(intArray, i, largest);
        }
    }

    private static void doSelectionSortApproachTwo(int[] intArray) {
        // Pushing the largest or the smallest number on the left side
        for (int i = 0; i < intArray.length; i++) {
            int largest = intArray.length - 1;

            for (int j = intArray.length - 1; j >= i; j--) {
                if (intArray[j] > intArray[largest]) { // (<) : Small to Large & (>) : Large to Small
                    largest = j;
                }
            }

            swap(intArray, i, largest);
        }
    }
}
