package com.AW;

public class Main {

    public static void main(String[] args) {

        isPrime(13);



    }




    private static void isPrime(int theNumber){
        int c=0;
        for(int i=1;i<=theNumber;i++){
//5
            if (theNumber%i==0){





                c++;

            }



        }
        if(c==2) System.out.println(theNumber+" Is a prime number");
        else System.out.println(theNumber + " Isn't prime");

    }
}
