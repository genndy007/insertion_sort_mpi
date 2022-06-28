package com.example.insertion_sort_mpj;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        ListSortable l1 = new ListSortable(size);
        InsertionSort isort = new InsertionSort(l1);

        isort.printList();
        isort.sortSequential();
        isort.printList();
    }
}
