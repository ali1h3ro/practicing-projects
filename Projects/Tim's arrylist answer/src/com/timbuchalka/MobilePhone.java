package com.timbuchalka;

import java.util.ArrayList;


public class MobilePhone {
    private String myNumber;



                    //So "Contact" data type is gonna allow us to store different objects from its class "Contact" in this case
                    // and it will allow us to access methods from inside each object inside the Arraylist

    private ArrayList<Contact> myContacts;



    // An array list of objects, each object has an entry of an information of a user
    // that's how accounts in websites are made all the information of the account is stored as an object
    //in an Arraylist

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    // Just checks if the added contact is already been added
    // parameter contact holds both the name and the number at the same position
    public boolean addNewContact(Contact contact) //Reference pointing  to the same object of "newContact"
    //in main and ".createNewcontact(String name, String number);
    {
        // it's telling the Class Contact.getName cuz as i said they point to the same object
        // and because they point to the same object the values are saved by the constructor
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
            //returns true so the if statement there doesn't get executed
        }
              // it doesn't exist so it adds it to the array list btw the type i Contact which the array that we've made

        // contact holds both value the name and the number .... how ? we passed the name and number through contacts constructor
        // and this way


        myContacts.add(contact);// it gonna save the object inside the array list 0_0

        return true;
        //returns true so the if statement there gets executed
    }
    public String queryContact(Contact contact) {
        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }

 //    A query is a request for information *it's gonna provide the object that we're asking for using the name
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);   //That gonna look inside the object that stored inside
            // the array list, and return the object that has the name
            // the whole fucking object stored in the array list
            // so query is a reference
        }
        return null;
    }

    // this is absolutely beatiful !!
    // so it's gonna get the old object , and the new object as parameters
    // then we gonna get the position of the old object in the Arraylist, and we gonna replace the old object with the new object using
    // .set(index or you can call it position in the Arraylist, The element which is the object;
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition <0) {
            System.out.println(contact.getName() +", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }
      // the overloaded method principle so if you call it and pass the object it will call findContact(Contact contact);
      // or if you pass the String it will call findContact(String contactName);
    private int findContact(String contactName) {
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }



    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                        this.myContacts.get(i).getName() + " -> " +
                        this.myContacts.get(i).getPhoneNumber());
        }

    }





















}
