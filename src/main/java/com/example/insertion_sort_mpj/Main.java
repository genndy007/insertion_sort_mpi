package com.example.insertion_sort_mpj;


import mpi.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int arraySize = 10;
        MPI.Init(args);
        int processId = MPI.COMM_WORLD.Rank();
        int processesNum = MPI.COMM_WORLD.Size();

        int[] initialArray = new int[arraySize];
        if (processId == MPIHelper.MASTER_PROCESS_ID) {
            for (int i = 0; i < arraySize; i++) {
                initialArray[i] = i + 2;
            }
        }
        MPI.COMM_WORLD.Bcast(initialArray, 0, arraySize, MPI.INT, MPIHelper.MASTER_PROCESS_ID);

        System.out.println("Process" + processId + ":" + Arrays.toString(initialArray));


        MPI.Finalize();


    }
}
