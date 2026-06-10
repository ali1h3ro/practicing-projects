package com.AW;

public class Main {

    public static void main(String[] args) {
        printEqual(-1,-1,-1);
    }



    public static void printEqual(int a, int b, int c){
        if ((a<0)||(b<0)||(c<0)){
            System.out.println("Invalid value");
        }

      else if(a==b&&b==c){
            System.out.println("They are equal");
        }
else{
            System.out.println("They are different");
        }

    }
}
