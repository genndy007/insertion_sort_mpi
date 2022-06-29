package com.example.insertion_sort_mpj;

import mpi.MPI;

import java.util.Arrays;
import java.util.List;

public class MPIHelper {
    public static final int MASTER_PROCESS_ID = 0;
//    public static void generateArrayBcast(int arraySize) {
//        int process_id = MPI.COMM_WORLD.Rank();
//        if (process_id == MASTER_PROCESS_ID) {
//            List<Integer> initialArray = ListHelper.generateRandomList(arraySize);
//        }
//    }


    public static int[] takeSubArrayMPI(int[] array) {
        int processId = MPI.COMM_WORLD.Rank();
        int processesNum = MPI.COMM_WORLD.Size();
        int chunkSize = array.length / processesNum;

        if (processId == processesNum - 1) {
            return Arrays.copyOfRange(array, processId * chunkSize, array.length);
        }
        return Arrays.copyOfRange(array, processId * chunkSize, (processId + 1) * chunkSize);
    }
}
