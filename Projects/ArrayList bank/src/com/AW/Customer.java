package com.AW;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private String Name;
    private double transaction;
    private ArrayList<Double> TransactionsList;
    private ArrayList<Customer> CustomerList;
    public Customer(String name,double transaction) {
        this.Name = name;
        this.TransactionsList = new ArrayList<Double>();
        this.transaction =  addTranst(transaction);
      this.CustomerList=   new ArrayList<Customer>();

        System.out.println("Customer with ini has been added"+name+" "+transaction);
    }
    public Customer() {

    }


    public boolean addCustomer(Customer customerOB) {
        if (Finder(customerOB) >= 1) {
            CustomerList.add(customerOB);


            return true;
        }

        return false;
    }



    public String getName() {
        return Name;
    }





    public void addTranst(double addtrans) {
        TransactionsList.add(addtrans);




    }
    private int Finder(Customer Customer){



        return CustomerList.indexOf(Customer);

    }


    public Customer query(String name){
        int position = Finder(name);
        if(position >=0) {
            return this.CustomerList.get(position);
        }
        return null;
    }




    private int Finder(String name){
        for (int i=0;i<CustomerList.size();i++){
            if (name.equals(CustomerList.get(i).getName()))
                return 1;
        }
        return -1;

    }

    public void printTransactions() {
        System.out.println(" Transaction List");

        for (int i = 0; i < this.TransactionsList.size(); i++) {

            System.out.println();
        }

    }
    public void printCustomers() {
        System.out.println("Bank List");
        for (int i = 0; i < this.CustomerList.size(); i++) {
            System.out.println((i + 1) + "." +
            this.CustomerList.get(i).getName() + " -> " );


            this.CustomerList.get(i).printTransactions();

        }
    }



}
