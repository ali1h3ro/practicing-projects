package com.AW;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] arrayReverse = {0,1,2,3,4,5,6,7};

        int mama = arrayReverse.length-1;

       int temp =0;

        for (int i = 0; i<arrayReverse.length/2;i++){

       temp = arrayReverse[i];
            arrayReverse[i] = arrayReverse[mama-i];
            arrayReverse[mama-i] = temp;

        }

        System.out.println(Arrays.toString(arrayReverse));


     }
}
