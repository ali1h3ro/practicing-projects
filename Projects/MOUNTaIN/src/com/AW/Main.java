package com.AW;

public class Main {

    public static void main(String[] args) {
      int space=5;
        for(int i=1; i<=5; i++){

            //print spaces
          for(int j=1; j<=space;j++)
           System.out.print(" ");

            //print stars
            for(int j=1; j<=i; j++)
                System.out.print("* ");

            //print new line
           System.out.print("\n");
         space--;

        }
    }
}
