package com.example.insertion_sort_mpj;

import java.util.ArrayList;
import java.util.List;

public class ListSortable {
    public int size;
    public List<Integer> array;
    private final int MIN_NUMBER = -100;
    private final int MAX_NUMBER = 100;

    public ListSortable(int size) {
        this.size = size;
        this.array = new ArrayList<>(size);
        this.generateRandomArray();
    }

    private void generateRandomArray() {
        for (int i = 0; i < this.size; i++) {
            this.array.add(RandomNumber.getInRange(this.MIN_NUMBER, this.MAX_NUMBER));
        }
    }

    public int getElement(int index) {
        return this.array.get(index);
    }

    public void swapElements(int i, int j) {
        int temp = this.array.get(i);
        this.array.set(i, this.array.get(j));
        this.array.set(j, temp);
    }

    public String toString() {
        return this.array.toString();
    }
}
