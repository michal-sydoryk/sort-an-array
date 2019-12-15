package com.epam.app;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new Random().ints(200).toArray();
        int[] arrayJavaSort = new int[array.length];

        System.arraycopy(array, 0, arrayJavaSort, 0 ,arrayJavaSort.length);

        long timeBefore;
        long timeAfter;

        timeBefore = System.nanoTime();
        for(int i=0; i < array.length; i++ ){
            for(int j=i+1; j <array.length; j++){
                if(array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        timeAfter = System.nanoTime();

        System.out.println((timeAfter - timeBefore) + " <-- my sorting time");

        timeBefore = System.nanoTime();
        Arrays.sort(arrayJavaSort);
        timeAfter = System.nanoTime();

        System.out.println((timeAfter - timeBefore) + " <-- Java sorting time");

    }
}
