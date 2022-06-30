package com.example.insertion_sort_mpj;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arraySize = 1000;
        MPIHelper.runMPISort(args, arraySize);
//        MPIHelper.runSeqSort(arraySize);

    }
}
