package com.AW;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {





        printArray(sortIntegers(getIntegers()));











    }





        public static int[] getIntegers(){

            Scanner scan = new Scanner(System.in);
            System.out.println("How many numbers are you going to enter ?");
            int numbersCount = scan.nextInt();
            int [] Get = new int[numbersCount];

            for(int i=0;i<Get.length;i++){
                System.out.println("Enter the "+i+" number");
                Get[i] = scan.nextInt();
                scan.nextLine();
            }
scan.close();
            return Get;
        }






   public static int[] sortIntegers(int[]Get){

       int [] stortedArray = Arrays.copyOf(Get, Get.length);


//                                       boolean flag = true;
                                       int temp;
//                                       while (flag){
//       System.out.println("the first loop"+Arrays.toString(stortedArray));
//
//                                           flag = false;
//                                           for (int i =0;i<stortedArray.length-1;i++){
//
//                                               if (stortedArray[i+1]>stortedArray[i]){
//
//                                                   temp = stortedArray[i];
//                                                   stortedArray[i] = stortedArray[i+1];
//                                                   stortedArray[i+1] = temp;
//                                                   flag = true;
//
//                                               }
//                                    System.out.println("the second loop after if "+Arrays.toString(stortedArray));
//
//                                           }
//                                       }

       for (int i = 0; i < stortedArray.length; ++i)
       {
           for (int j = i + 1; j < stortedArray.length; ++j)
           {
               if (stortedArray[i] < stortedArray[j])
               {
                   temp = stortedArray[i];
                   stortedArray[i] = stortedArray[j];
                   stortedArray[j] = temp;
               }
           }
       }
                                      System.out.println("the second loop after if "+Arrays.toString(stortedArray));

       return stortedArray;




   }
public static void printArray(int[] sorter){





        for (int i=0;i<sorter.length;i++){

            System.out.println(sorter[i]);
        }

}
    }



