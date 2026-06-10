package com.AW;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    private ArrayList<Bank> BankList;
    private static Branch branchOb = new Branch();
    private String name;
    private Branch branch;


    public Bank(String name) {
        this.name = name;

        this.BankList = new ArrayList<>();
    }
    public Bank() {

    }


    public String getName() {
        return name;
    }




    public boolean addBank(Bank BankObject) {


        if (Finder(BankObject) >= 0) {
            BankList.add(BankObject);
            return true;
        }
        return false;
    }



    public void pirntListOfCustomersInBranch(String name){
        int poistion = Finder(name);
        if(poistion>=0){
        }
    }

    public ArrayList<Bank> getBankList() {
        return BankList;
    }

    //That's gonna be done in main
//    public void addBranch(String BankName){
//      int position =  Finder(BankName);
//        if (position>=1){
//
//        }
//
//
//    }






    private int Finder(Bank bank){



        return BankList.indexOf(bank);

    }
    private int Finder(String contactName) {
        for(int i=0; i<this.BankList.size(); i++) {
            Bank contact = this.BankList.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }



         public void printBanks() {
             System.out.println("Bank List");
             for (int i = 0; i < this.BankList.size(); i++) {
                 System.out.println((i + 1) + "." +
                         this.BankList.get(i).getName() + " -> ");

             }
         }

             public Bank query(String name){
                 int position = Finder(name);
                 if(position >=0) {
                     return this.BankList.get(position);   //That gonna look inside the object that stored inside
                     // the array list, and return the object that has the name
                     // the whole fucking object stored in the array list
                     // so query is a reference
                 }
                 return null;
             }

           public  Branch getBranch(){


        return this.branch;


           }





    }



