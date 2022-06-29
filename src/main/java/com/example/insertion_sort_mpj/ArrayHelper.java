package com.example.insertion_sort_mpj;

public class ArrayHelper {
    public static final int MIN_NUMBER = -100;
    public static final int MAX_NUMBER = 100;

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = RandomNumber.getInRange(MIN_NUMBER, MAX_NUMBER);
        return array;
    }

    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
