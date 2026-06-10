package com.AW;

import java.util.Scanner;

public class Main {
     private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(5)));
     }

     public static int[] readIntegers (int count){
         int[] Array = new int[count];
         for(int i=0;i<Array.length;i++){
             Array[i] = scanner.nextInt();
         }
         scanner.close();

         return Array;
     }

/*     public static int findMin(int[] Array){
     int temp=0;
     boolean momo = true;
     while (momo) {
         momo = false;
         for (int i=0;i<Array.length-1;i++){
             if(Array[i]>Array[i+1]){
                 temp = Array[i+1];
                 Array[i+1] = Array[i];
                 Array[i] = temp;
                 momo = true;
             }
         }
     }
return Array[0];
     }*/

      public static int findMin(int[] Array){
          int min = Integer.MAX_VALUE; // because i don't remember the highest number in java, i called this field
          // just using it for setting up the largest value the int can take :) u can set 100 if u want and it will work the same
          for (int i=0;i<Array.length;i++){
              if (Array[i]<min ){
                  min = Array[i];
              }
         }
          return min;
      }

}
