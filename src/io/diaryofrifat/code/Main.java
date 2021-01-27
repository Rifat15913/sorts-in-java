package io.diaryofrifat.code;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        doSelectionSort(intArray);
    }

    private static void doSelectionSort(int[] intArray) {
        for (int i = intArray.length - 1; i > 0; i--) {
            int largest = 0;

            for (int j = 1; j <= i; j++) {
                if (intArray[j] > intArray[largest]) { // (>) : Small to Large & (<) : Large to Small
                    largest = j;
                }
            }

            swap(intArray, i, largest);
        }

        printArray(intArray);
    }

    private static void doBubbleSort(int[] intArray) {
        doBubbleSortApproachOne(intArray);
        //doBubbleSortApproachTwo(intArray);

        printArray(intArray);
    }

    private static void printArray(int[] intArray) {
        for (int j : intArray) {
            System.out.print(j + " ");
        }
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

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
