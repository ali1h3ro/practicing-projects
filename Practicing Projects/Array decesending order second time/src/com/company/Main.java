package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        PrintArray(SortInt(GetInt()));

    }




    public static int [] GetInt(){
        Scanner scan = new Scanner(System.in);
        int [] Array = new int[7];
         for (int x =0;x<Array.length;x++){
             Array[x] = scan.nextInt();
         }
        return Array;
    }



    public static int [] SortInt(int[] GetInt){
        int [] sortIntger = new int[GetInt.length];
        System.arraycopy(GetInt, 0, sortIntger, 0, GetInt.length);
        int temp = 0;
        for (int i = 0;i<sortIntger.length;i++){
            for (int j = 0;j<sortIntger.length;j++){

                if (sortIntger[i]<sortIntger[j]) {
                    temp = sortIntger[i];
                    sortIntger[i] = sortIntger[j];
                    sortIntger[j] = temp;
                }
            }
        }
        return sortIntger;
    }


    public static void PrintArray(int[] sortedInt){

                    for (int i =0;i<sortedInt.length;i++){
                        System.out.println(sortedInt[i]);
                    }
    }
}
