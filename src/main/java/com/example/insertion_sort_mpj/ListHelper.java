package com.example.insertion_sort_mpj;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
    public static final int MIN_NUMBER = -100;
    public static final int MAX_NUMBER = 100;

    public static List<Integer> generatorRandomList(int size) {
        List<Integer> array = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            array.add(RandomNumber.getInRange(MIN_NUMBER, MAX_NUMBER));
        }
        return array;
    }

    public static void swapElements(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}
