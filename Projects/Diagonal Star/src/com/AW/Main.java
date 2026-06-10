package com.AW;

public class Main {

                // Checking boundary conditions
                // and main diagonal and
                // secondary diagonal conditions
                // i==0 for printing all of the first line
                // j==0 for printing the first character of every line every time
                // i==j for for typing the line one reverse from the smallest to the largest
                // i==n-1 for printing all of the last line
                // j==n-1 for printing the last character in every line
                // i + j == n - 1 for typing the line one reverse from the largest to the smallest || i == n - 1 || j == n - 1||i + j == n - 1||i==j
//if (i == 0 || j == 0 ||j==n-1 || i == n-1 || j == i ||j+i==n-1)
    public static void main(String[] args) {

        int n = 8;

        // Loop denoting rows
        for (int i = 0; i < n; i++) {
            // Loop denoting columns
            for (int j = 0; j < n*2; j++) {

                if (i ==n-1 || j ==n*2/2 || i + j == n*2/2 ||i+n*2/2==j  )


                    System.out.print("*");
                else
                    System.out.print(" ");
            }
           System.out.println();


        }

    }
}
