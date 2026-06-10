package com.AW;

public class Main {

    public static void main(String[] args) {



        int min = Integer.MAX_VALUE;

         int max = Integer.MIN_VALUE;



                 int[]Value = {3,2,0,5,3,1,4};


                 for (int i = 0;i<Value.length;i++){
                     if(min>Value[i]){
                         min = Value[i];

                     }
                     if(max<Value[i]){
                         max = Value[i];

                     }


                 }

        System.out.println(min +"\n" +
                ""+max );




    }
}
