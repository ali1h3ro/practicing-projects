package com.company;

import java.util.Scanner;

public class Main {

    // static = physical in the memory
    // dynamic = theory
    // instantiate the theory(apply it) to make it physical...
    // just like when you say


    private static boolean quit= false;
    private static Scanner input = new Scanner(System.in);
    private static UserList ObjList = new UserList("#330");// Instantiated it meaning you created a static version or a physical
                                                     // version of the blueprint(theoritcal instance)





    public static void main(String[] args) {


               while (!quit) {

                   System.out.println("\nEnter action: (6 to show available actions)");
                   int action = input.nextInt();
                   input.nextLine();

                   switch (action) {

                       case 0:
                           quit = true;
                           break;

                       case 1:
                           CreateUser();
                           break;

                       case 2:
                           DeleteUser();
                           break;

                       case 3:
                           UpdateUser();
                           break;

                       case 4:
                           askForUserInfo();

                           break;

                       case 5:
                           ObjList.outputCurrentUsers();
                           break;

                       case 6:
                           PrintOptions();
                           break;
                   }
               }







    }


       public static void CreateUser(){

           System.out.println("Enter the UserName");
           String userName = input.nextLine();

           System.out.println("Enter the Email");
           String Email = input.nextLine();

           System.out.println("Enter the Password");
           String Password  = input.nextLine();


           UserInf PushObj = new UserInf(userName,Email,Password);

                if  ( ObjList.addOBJ(PushObj)) {
                    System.out.println("Created successfully name : " + userName + "\n ");
                }
                else System.out.println("Error Already existing user name or email");
                                }





                          static void      DeleteUser(){
                                    System.out.println("Enter  UserName or email");
                                    String userName = input.nextLine();
                                   if ( ObjList.deleteOBJ(userName) ){
                                       System.out.println("Done");
                                   }
                                   else System.out.println("Error");

                                }





                                  static void    UpdateUser() {
                                      System.out.println("1- email 2- user 3- password?");
                                      int number = input.nextInt();
                                      input.nextLine();
                                      System.out.println(" Enter old : :");

                                      String var = input.nextLine();
                                      System.out.println("Enter new");
                                      String newVar = input.nextLine();

                                    if (ObjList.UpdateOBJ(number,var,newVar)){
                                        System.out.println(ObjList.QueryOBJ(newVar).getUserName()+
                                                        ObjList.QueryOBJ(newVar).getEmail()+
                                        "has been updated"

                                        );
                                    }
                                  }






                           static void   askForUserInfo(){
                               System.out.println("Enter... : ");
                                         String var = input.nextLine();
                                  System.out.println(ObjList.QueryOBJ(var).getUserName()+
                                          ObjList.QueryOBJ(var).getEmail()

                                  );

                              }









                     static void     PrintOptions(){
                              System.out.println("\nAvailable actions:\npress");
                              System.out.println("0  - to shutdown\n" +
                                      "1  - to create Account\n" +
                                      "2  - to remove an existing Account\n" +
                                      "3  - to update existing an existing contact\n" +
                                      "4  - Ask for info\n" +
                                      "5  - Print all accounts\n" +
                                      "6  - to print a list of available actions.");
                              System.out.println("Choose your action: ");
                          }






}
