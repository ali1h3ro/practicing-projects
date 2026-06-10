package com.company;

import java.util.Scanner;

public class Main {
    //Create Bank

   public static Bank mouselBank = new Bank();
     public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

                boolean quite = false;

        int action =0;


        while (!quite){
            PrintOptions();
             action = input.nextInt();
             input.nextLine();
            switch (action) {
                case 0 : quite = true;
                break;
                case 1 :
                    newBranch();
                break;

                case 2 :
                    newCustomer();
                     break;

                case 3 : newTransaction();
                break;

                case 4 : listBranches();
                    break;

                case 5 : listCustomer();
                    break;

                case 6 : listTransactions();
                    break;

                case 7 :   PrintOptions();

            }
        }
    }


    public static void newBranch(){
        System.out.println("Enter Branch name ");
        String dwa = input.nextLine();
        mouselBank.NewBranch(dwa);
    }

    public static void newCustomer(){
        System.out.println("Select branch");

        String selectBranch = input.nextLine();
        System.out.println("Enter Customer name");

        String customerName = input.nextLine();
        System.out.println("Enter Initial value");

        double customerinitialValue = input.nextDouble();
        mouselBank.newCustomer(selectBranch,customerName,customerinitialValue);
    }



    public static void newTransaction(){
        mouselBank.listBranches();
        System.out.println("Select branch");
        String Branch = input.nextLine();
        mouselBank.listCustomer(Branch);
        System.out.println("Select Customer");
        String Name = input.nextLine();
        System.out.println("Enter Value");
        double value = input.nextDouble();
        mouselBank.addTransaction(Branch,Name,value);
    }
    public static void listBranches(){
        mouselBank.listBranches();

    }
    public static void listCustomer(){
        System.out.println("Select branch");
        String Branch = input.nextLine();

        mouselBank.listCustomer(Branch);

    }
 public static void listTransactions(){
     System.out.println("Select branch");
     String Branch = input.nextLine();

     System.out.println("Select Customer");
     String Name = input.nextLine();


     mouselBank.listTransactions(Branch,Name);
 }

    static void     PrintOptions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to create Branch\n" +
                "2  - to create Customer\n" +
                "3  - to add transaction\n" +
                "4  - List branches\n" +
                "5  - List customers\n" +
                "6  - List transactions");
        System.out.println("Choose your action: ");
    }
























}