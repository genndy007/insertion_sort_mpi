package com.example.insertion_sort_mpj;

import java.util.List;

public class InsertionSort {
    public static void sortSequential(List<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            int j = i;
            while (j > 0 && array.get(j - 1) > array.get(j)) {
                ListHelper.swapElements(array, j, j - 1);
                j = j - 1;
            }
        }
    }
}
