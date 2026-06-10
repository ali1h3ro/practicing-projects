package com.AW;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {











        private static Scanner scan = new Scanner(System.in);
        private static Bank bank = new Bank();
    private static Branch branch = new Branch();
    private static Customer customer = new Customer();

    public static void main(String[] args) {
     //   Bank ALrsheedBank = new Bank();

        boolean Quite = false;


        while (!Quite) {
            int Selection = scan.nextInt();
            scan.nextLine();
            switch (Selection) {
                case 0 :
                    System.out.println("\nShutting down...");
                    Quite = true;
                    break;
                case 1 :
                    addBank();
                    break;
                case 2 :
                    addBranch();
                    break;
                case 3 : addCustomer();
                break;
                case 4 : Addtrans();
                break;
                case 5 : bank.printBanks();
                break;
                case 6 : bank.getBranch().printBranches();
                case 7 : bank.getBranch().getCustomer().printCustomers()

            }


        }
    }


//
    public static void addBank(){
        String bankName = scan.nextLine();
   //     Bank bank = new Bank("bankName"); //is the same as below
     Bank bank1 =   new Bank("bankName");


     if(bank.addBank(bank1))
            System.out.println("Bank "+bankName+" has been added");


    }
    public static void addBranch(){
        String branchName = scan.nextLine();
        Branch branch = new Branch(branchName);
     if     (bank.getBranch().addBranch(branch)) {

         System.out.println("Bank " + branchName + " has been added");
     }
        else System.out.println(branchName+" already exists");

    }

    public static void addCustomer(){

        bank.printBanks();

               if(queryBank()){
                   System.out.println("Enter existing Branch name name\n");
                   bank.getBranch().printBranches();
                   if (queryBranch()){
                       String name = scan.nextLine();
                       double iniTrans = scan.nextDouble();
                       Customer customer = new Customer(name,iniTrans);
                       bank.getBranch().getCustomer().addCustomer(customer);
                   }

               }
               else System.out.println("Bank doesn't exist");


    }


    private static void Addtrans(){
        double trans = scan.nextDouble();
        if (queryCustomers(trans)){

            System.out.println(trans+" has been added successfully");

        }
    }


    private static Bank queryBank() {
        String name = scan.nextLine();
        Bank existingBankRecord = bank.query(name);
        if(existingBankRecord!=null){
            return existingBankRecord;
        }
         return null;

    }
    private static boolean queryBranch(){
        String name = scan.nextLine();
        Branch existingBankRecord = bank.getBranch().query(name);
        if(existingBankRecord!=null){
            return true;
        }
        return false;
        }
    private static boolean queryCustomers(double newTrans){
        String name = scan.nextLine();
        Customer existingBankRecord = bank.getBranch().getCustomer().query(name);
        if(existingBankRecord!=null){
            bank.getBranch().getCustomer().addTranst(newTrans);
            return true;
        }
        return false;
    }























}
