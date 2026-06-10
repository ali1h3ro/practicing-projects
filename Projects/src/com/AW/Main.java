package com.AW;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5;
        int anotherIntValue = myIntValue;


        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        anotherIntValue = 4;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

          int[] IntArray = new int[5];
             int[] mamaseita = IntArray;

        System.out.println("IntArray = "+ Arrays.toString(mamaseita));
        System.out.println("anotherIntValue = "+ Arrays.toString(IntArray));


        mamaseita[0] = 1;
        System.out.println("IntArray = "+ Arrays.toString(mamaseita));
        System.out.println("anotherIntValue = "+ Arrays.toString(IntArray));

        ArrayModifire(IntArray);
        System.out.println("IntArray = "+ Arrays.toString(mamaseita));
        System.out.println("anotherIntValue = "+ Arrays.toString(IntArray));

    }

    private static void ArrayModifire(int[] momo){

        momo[0] = 4;      // to the same object as IntArray and Another array
  momo = new int[] {5,4,3,2,7,8,0} ;      // dereference it to new object :)





    }



}
