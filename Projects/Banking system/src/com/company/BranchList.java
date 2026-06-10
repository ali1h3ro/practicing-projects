package com.company;

import java.util.ArrayList;

public class BranchList {
    private ArrayList<Branch> branchlist;
    public BranchList() {
        this.branchlist = new ArrayList<Branch>();
    }










    public void addBranchObj (Branch branch) {

        branchlist.add(branch);

    }





    public void createCustomer (String name,double value, int position){
                  Customer customer = new Customer(name,value);
         branchlist.get(position).getCustomerList().add(customer);

    }
    public void listBranch (){

        for (int i = 0; i<branchlist.size();i++){
            System.out.println(branchlist.get(i).getName());
        }
    }
    public void listCustomers (int pos){

        for (int i = 0; i<branchlist.get(pos).getCustomerList().size();i++){
            System.out.println(branchlist.get(pos).getCustomerList().get(i).getName());
        }
    }
    public void listTransactions (int BranchPos,int CustomerPos){

        for (int i = 0; i<branchlist.get(BranchPos).getCustomerList().get(CustomerPos).getTransactions().size();i++){
            System.out.println(branchlist.get(BranchPos).getCustomerList().get(CustomerPos).getTransactions().get(i));
        }
    }


    public int FindBranch (String name){

        for (int i = 0; i<branchlist.size();i++){
            if (branchlist.get(i).getName().equals(name)){

                return i;
            }



        }
        return -1;

    }


//    public Branch queryBranch (String name){
//        for (int i = 0; i<branchlist.size();i++){
//            if (branchlist.get(i).getName().equals(name)){
//
//                branchlist.get(i);
//            }
//
//
//
//        }
//        System.out.println("Doesn't exist");
//        return null;
//
//    }

    public int FindCustomer(String name,int pos){

        for (int i = 0; i<branchlist.size();i++){
            if (branchlist.get(pos).getCustomerList().get(i).getName().equals(name)){

                return i;
            }
        }
        return -1;

    }


    public void addTransactions (String branchName, String CustomerName,double transaction){
    int i =    FindBranch(branchName);
    if (i<=0){
       int j = FindCustomer(CustomerName,i);
       if (j<=0){

           branchlist.get(i).getCustomerList().get(j).getTransactions().add(transaction);

       }
       else System.out.println("Customer doesn't exist");
    }
    else System.out.println("Branch doesn't exist");


    }





    }


