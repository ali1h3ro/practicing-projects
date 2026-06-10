package com.timbuchalka;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
	    // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        // they're gonna be saved in the constructor in the object the everybody points to



        // a new object inside Contact class is gonna be created by the name or reference of "newContact" when
        // you call the method
                         // this part is gonna create the object inside the class itself by its method "REFERENCE"

        // you can replace "new Contact(name,phone)" with Contact.createContact(name, phone)
        //they do the same job
        Contact newContact = new Contact(name,phone);//we can call the method directly because the method in Contact class is static.
          // both of them point to the same object    "newContact" is a reference ".createContact is a reference"

        // System.out.println(newContact);
        // when you try to print it out you can't get it because it's a reference of and object lmao
        // it has the values in the getters being put by the constructor and newContact point to the same object


//                Object of class Contact
//            /              |               \
//           /               |                \               they all point to the same object
//          /                |                 \
//         /                 |                  \
//        /                  |                   \
//       /                   |                    \
//newContact            contact         Contact.createContact(name, phone)
        //              parameter

//Reference




        if(mobilePhone.addNewContact(newContact))
        // the call inside the if statement is gonna Pass the object that has the values inside the constructor to
        // be saved by the arraylist
            // the Array list is actually gonna be a list of objects, an object for each new entry
        {
            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }
     // this method is gonna use two methods inside MobilePhone class
    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        // mobilePhone.queryContact(name); is gonna return the object stored
        // in the Arraylist, that will allow us to change both of the number and the name
        // at the same time, depending on the name only.

        Contact existingContactRecord = mobilePhone.queryContact(name);
        // is gonna make existingContactRecord a reference that points to the same object
        if(existingContactRecord == null) // is gonna check if the object exists in the Arraylist
        {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }
       // this method is gonna check if the entered information exists
    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);// we're getting the whole object by using just the name by getting the position using
                                                                       // findContact(name);method and, so we're querying for the object.
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                           "1  - to print contacts\n" +
                           "2  - to add a new contact\n" +
                           "3  - to update existing an existing contact\n" +
                           "4  - to remove an existing contact\n" +
                           "5  - query if an existing contact exists\n" +
                           "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }



























}
