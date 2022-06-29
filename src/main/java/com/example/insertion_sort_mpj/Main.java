package com.example.insertion_sort_mpj;


import mpi.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int arraySize = 20;

        MPI.Init(args);
        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();
        if (rank == 0) {
            List<Integer> l1 = ListHelper.generatorRandomList(arraySize);
            System.out.println(l1);
            InsertionSort.sortSequential(l1);
            System.out.println(l1);
        }
        System.out.println("Rank " + rank + " Size " + size);
        MPI.Finalize();
    }
}
