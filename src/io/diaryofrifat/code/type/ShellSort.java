package io.diaryofrifat.code.type;

import static io.diaryofrifat.code.Utils.printArray;

public class ShellSort {
    public static void sort(int[] intArray) {

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int currentElement = intArray[i];

                int j;

                for (j = i; j >= gap && intArray[j - gap] > currentElement; j -= gap) {
                    intArray[j] = intArray[j - gap];
                }

                intArray[j] = currentElement;
            }
        }

        printArray(intArray);
    }
}
