package com.example.insertion_sort_mpj;

public class InsertionSort {
    public ListSortable list;
    public InsertionSort(ListSortable listSortable) {
        this.list = listSortable;
    }

    public void sortSequential() {
        for (int i = 1; i < this.list.size; i++) {
            int j = i;
            while (j > 0 && this.list.getElement(j - 1) > this.list.getElement(j)) {
                this.list.swapElements(j, j - 1);
                j = j - 1;
            }
        }
    }

    public void printList() {
        System.out.println(this.list);
    }
}
