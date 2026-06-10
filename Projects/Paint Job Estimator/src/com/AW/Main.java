package com.AW;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of rooms ");
        int NumOfRooms = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Space of room wall ");
        int WallSpceOfRm = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Price of paint per gallon ");
        int PricPerOfPaintPerGallon = scanner.nextInt();
        scanner.close();
        int TotalWall = NumOfRooms*WallSpceOfRm;


        System.out.println("Total wall is "+TotalWall);
        System.out.println("The number of gallons of paint required: "+NoOfGallonsREQ (TotalWall)+"\n The hours of labor required :"+HoursOfLaborREQ (TotalWall)+
                "\n  The cost of the paint: " +CostOfPaint (PricPerOfPaintPerGallon,TotalWall)+ "\nThe labor charges : "
                +LaborCharges (TotalWall)+"\nThe total cost of the paint job :"+TotalCostOfPaintJob (PricPerOfPaintPerGallon,TotalWall)


        );
    }





        public static int NoOfGallonsREQ (int TotalWall) {
            return  TotalWall/115;
        }

        public static double HoursOfLaborREQ (int TotalWall) {
return TotalWall/14.3;
        }
        public static int CostOfPaint (int PricPerOfPaintPerGallon,int TotalWall) {
        return PricPerOfPaintPerGallon*TotalWall/115;

        }
        public static int LaborCharges (int TotalWall) {
        return TotalWall/115*18;

        }
        public static int TotalCostOfPaintJob (int PricPerOfPaintPerGallon,int TotalWall) {
           return PricPerOfPaintPerGallon*TotalWall/115+TotalWall/115*18;
        }

    }










