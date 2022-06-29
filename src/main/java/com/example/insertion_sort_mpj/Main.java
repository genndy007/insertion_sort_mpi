package com.example.insertion_sort_mpj;


import mpi.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arraySize = 20;
        MPI.Init(args);
        int processId = MPI.COMM_WORLD.Rank();
        int processesNum = MPI.COMM_WORLD.Size();

        int[] initialArray = new int[arraySize];
        if (processId == MPIHelper.MASTER_PROCESS_ID) {
            initialArray = ArrayHelper.generateRandomArray(arraySize);
            System.out.println(Arrays.toString(initialArray));
            InsertionSort.sortSequential(initialArray);
            System.out.println(Arrays.toString(initialArray));
        }
        MPI.COMM_WORLD.Bcast(initialArray, 0, arraySize, MPI.INT, MPIHelper.MASTER_PROCESS_ID);

        int[] subArray = MPIHelper.takeSubArrayMPI(initialArray);

        System.out.println("Process" + processId + ":" + Arrays.toString(subArray));


        MPI.Finalize();


    }
}
