package com.company;

import java.util.ArrayList;

public class Customer {


    private String name;

    public String getName() {
        return name;
    }

    private  double Value;
    private ArrayList<Double> Transactions;
    public Customer(String name, double value) {
        this.name = name;
        this.Value = value;
        this.Transactions = new ArrayList<Double>();
        Transactions.add(value);
    }


    public ArrayList<Double> getTransactions() {
        return Transactions;
    }
}
