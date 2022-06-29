package com.example.insertion_sort_mpj;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
    public static final int MIN_NUMBER = -100;
    public static final int MAX_NUMBER = 100;

    public static List<Integer> generateRandomList(int size) {
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

    public static List<List<Integer>> splitList(List<Integer> array, int chunksNum) {
        List<List<Integer>> subLists = new ArrayList<>(chunksNum);
        int chunkSize = array.size() / chunksNum;
        int startIndex = 0;
        int endIndex = chunkSize;

        while (endIndex < array.size()) {
            List<Integer> subList = array.subList(startIndex, endIndex);
            subLists.add(subList);
            startIndex += chunkSize;
            endIndex += chunkSize;
        }

        List<Integer> lastSubList = array.subList(startIndex, array.size());
        subLists.add(lastSubList);

        return subLists;
    }
}
