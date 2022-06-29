package com.example.insertion_sort_mpj;

import mpi.MPI;

import java.util.List;

public class MPIHelper {
    public static final int MASTER_PROCESS_ID = 0;
    public static void generateArrayBcast(int arraySize) {
        int process_id = MPI.COMM_WORLD.Rank();
        if (process_id == MASTER_PROCESS_ID) {
            List<Integer> initialArray = ListHelper.generateRandomList(arraySize);
        }
    }


    public static List<Integer> takeSubListMPI(List<Integer> array) {
        int process_id = MPI.COMM_WORLD.Rank();
        int processes_num = MPI.COMM_WORLD.Size();
        int chunkSize = array.size() / processes_num;

        if (process_id == processes_num - 1) {
            return array.subList(process_id * chunkSize, array.size());
        }
        return array.subList(process_id * chunkSize, (process_id + 1) * chunkSize);
    }
}
