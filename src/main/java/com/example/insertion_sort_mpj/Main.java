package com.example.insertion_sort_mpj;


import mpi.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int arraySize = 20;
        MPI.Init(args);
        int process_id = MPI.COMM_WORLD.Rank();
        int processes_num = MPI.COMM_WORLD.Size();

        if (process_id == 0) {
            List<Integer> l1 = ListHelper.generatorRandomList(arraySize);
            System.out.println(l1);
            List<List<Integer>> subLists = ListHelper.splitList(l1, processes_num);
            System.out.println(subLists);

        }
        System.out.println("Rank " + process_id + " Size " + processes_num);

        MPI.Finalize();
    }
}
