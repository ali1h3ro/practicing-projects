package com.AW;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(FindMin(readIntegers(5)));
    }


    public static int[] readIntegers(int count) {
        Scanner scan = new Scanner(System.in);
        int[] getInt = new int[count];
        System.out.println("Enter five numbers");
        for (int i = 0; i < getInt.length; i++) {
            boolean isit = scan.hasNextInt();
            if (isit) {
                getInt[i] = scan.nextInt();
            } else {
                System.out.println("NO");
                break;


            }

        }

        return getInt;
    }


    public static int FindMin(int[] array) {

        int[] Storedarray = Arrays.copyOf(array, array.length);
//        int temp;
//        for (int i = 0; i < Storedarray.length; i++) {
//            for (int j = i + 1;j<Storedarray.length;j++){
//                if(Storedarray[i]>Storedarray[j]){
//                   temp = Storedarray[i];
//                    Storedarray[i] = Storedarray[j];
//                    Storedarray[j]=temp;
//                }
//            }
//        }
       int min = Integer.MAX_VALUE; /* we use MAX_VALUE cuz all the values r gon be low and we don't want to have the first
       value to be higher than min we always want the first value to be lower then min
       and the same goes for     max = MIN_VALUE we don't the first number to be lower than the max*/
            for (int i = 0; i < Storedarray.length; i++) {
                         if(Storedarray[i]<min){
                                  min = Storedarray[i];
                             System.out.println(min);
                             System.out.println(Arrays.toString(Storedarray));

                         }
            }




        return min;
    }

}