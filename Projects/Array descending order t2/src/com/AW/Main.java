package com.AW;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        int[] DescendingArray = {0,3,5,4,1,2};
        int temp = 0;

        for (int i = 0;i<DescendingArray.length;i++){
            for (int j = i+1;j<DescendingArray.length;j++){
                if (DescendingArray[i]<DescendingArray[j]){
                    temp = DescendingArray[i];
                    DescendingArray[i] = DescendingArray[j];
                    DescendingArray[j] = temp;
                }
       }

        }

        System.out.println(Arrays.toString(DescendingArray));



    }
}
