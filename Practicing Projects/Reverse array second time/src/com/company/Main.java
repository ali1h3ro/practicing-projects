package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PrintArray(SortInt(GetInt()));

    }


    public static int [] GetInt(){
        Scanner scan = new Scanner(System.in);
        int [] Array = new int[5];
        for (int x =0;x<Array.length;x++){
            Array[x] = scan.nextInt();
        }
        System.out.println(Arrays.toString(Array));
        return Array;
    }

    public static int [] SortInt(int[] GetInt){
        int temp = 0;
        int [] ReverseIntger = new int[GetInt.length];

          System.arraycopy(GetInt,0,ReverseIntger,0,GetInt.length);
        int L = GetInt.length-1;
         int length = GetInt.length /2;

        for (int i =0;i<length;i++){
            temp = ReverseIntger[i];
            ReverseIntger[i] = ReverseIntger[L];
            ReverseIntger[L] =temp;
            L--;
        }
        return ReverseIntger;
    }

    public static void PrintArray(int[] reversedInt){

        System.out.println(Arrays.toString(reversedInt));

    }
}
