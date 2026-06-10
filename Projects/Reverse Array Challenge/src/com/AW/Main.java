package com.AW;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] Array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(Array));

        reverse(Array);
        System.out.println(Arrays.toString(Array));

    }

//MYmethod
//    public static void reverse(int[] array){
//        int [] storedArray = Arrays.copyOf(array,array.length);
//              int j = storedArray.length-1;
//         for(int i=0;i<array.length;i++){
//            array[i] = storedArray[j--];
//
//        }
//    }

   //  this is awesome
          public static void reverse(int[] array) {
              int temp;
              int bottomindex = array.length - 1;

              int halflength = array.length / 2;
              for (int i = 0; i < halflength; i++) {
                  temp = array[i];
                  array[i] = array[bottomindex - i];
                  array[bottomindex - i] = temp;
              }
          }
}



