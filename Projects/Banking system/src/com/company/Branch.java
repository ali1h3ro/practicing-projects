package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customerList = new ArrayList<Customer>();


    private String name;



    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();

    }




    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public String getName() {
        return name;
    }
}
