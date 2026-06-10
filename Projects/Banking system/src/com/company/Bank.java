package com.company;

import java.util.ArrayList;




public class Bank {

private final BranchList branchList = new BranchList();


    public Bank() {

    }

    public void  NewBranch(String name){

        Branch createBranch = new Branch(name);


              branchList.addBranchObj(createBranch);

    }



    public boolean newCustomer(String BranchName,String name, double initialValue){

                     int i = branchList.FindBranch(BranchName);


                     if (i>=0) {
                         branchList.createCustomer(name,initialValue,i);
                         return true;
                     }

                    return false;
    }

    public void listBranches (){

        branchList.listBranch();

    }

    public void listCustomer(String Branch){
      int i =  branchList.FindBranch(Branch);

      branchList.listCustomers(i);

    }

    public void listTransactions(String branchName,String customerName){
       int i = branchList.FindBranch(branchName);
       int j = branchList.FindCustomer(customerName,i);

       branchList.listTransactions(i,j);

    }


    public void addTransaction (String BranchName,String CustomerName,double transaction){

        branchList.addTransactions(BranchName,CustomerName,transaction);


    }











}
