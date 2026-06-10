package com.AW;

import java.util.ArrayList;

public class Branch {


    private String brangchName;
    private ArrayList<Branch> BranchList;
    private  Customer customer;


    public Branch(String brangchName) {
        this.brangchName = brangchName;
        this.BranchList = new ArrayList<Branch>();

    }

    public Branch() {

    }


    private int Finder(Branch branch) {


        return BranchList.indexOf(branch);

    }

    public boolean addBranch(Branch branchOB) {
        if (Finder(branchOB) >= 1) {
            BranchList.add(branchOB);


            return true;
        }

        return false;
    }


    public void printBranches() {
        System.out.println("Branches List");
        for (int i = 0; i < this.BranchList.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.BranchList.get(i).getBrangchName() + " -> ");

        }

    }
    public Branch query(String name){
        int position = Finder(name);
        if(position >=0) {
            return this.BranchList.get(position);   //That gonna look inside the object that stored inside
            // the array list, and return the object that has the name
            // the whole fucking object stored in the array list
            // so query is a reference
        }
        return null;
    }


    private int Finder(String contactName) {
        for (int i = 0; i < this.BranchList.size(); i++) {
            Branch branch = this.BranchList.get(i);
            if (branch.getBrangchName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String getBrangchName() {
        return brangchName;
    }
    public Customer getCustomer (){
        return this.customer;
    }


    }


