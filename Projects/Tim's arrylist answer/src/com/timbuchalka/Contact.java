package com.timbuchalka;

/**
 * Created by dev on 28/08/15.
 */
public class Contact {
    private String name;
    private String phoneNumber;
    // the final destination //
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
          //this reference is gonna be used in main to store the values in the "Contact"  it's static so it can be directly called
          // by the Main static method
          // basically createContact is gonna be instantiated inside the same class by calling it in main
         // and the values are gonna be saved by an object of the class

    // it's a static class so main can call this method without creating a new instance
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
        // it used it's own constructor to assign the values
    }
}
