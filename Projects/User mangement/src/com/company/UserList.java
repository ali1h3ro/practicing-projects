package com.company;

import java.security.PublicKey;
import java.util.ArrayList;
public class UserList {
    private final String idNumber;
    //This class has everything to do with objects in the List

Integer
    // you don't make userobj static because this class is gonna be instantiated by main
    // and you don't want static var in dynamic or instance class

    private ArrayList<UserInf> UserObjList; // instantiated a physical version of ArrayList, but the property is theoretical
    // and we don't need to make it physical because it's gonna be called by
    // theoretical methods ....


    //theoretical = dynamic  = instance = have to be instantiated
    //physical = static = doesn't need to be instantiated  because it's physical

    public UserList(String idNumber) {
        this.idNumber = idNumber;
        UserObjList = new ArrayList<UserInf>();
    }

    public boolean addOBJ(UserInf receiveObj) {

        if (findOBJposition(receiveObj) < 0) {

            UserObjList.add(receiveObj);

            return true;
        }

        return false;
    }


    public boolean deleteOBJ(String var) {
        UserInf Update = findOBJposition(var);
        int number = findOBJposition(Update);
        if (number >= 0) {
            UserObjList.remove(number);
            return true;
        }
        return false;


    }


    public boolean UpdateOBJ(int c,String var,String newvar) {

        UserInf Update = findOBJposition(var);
        int number = findOBJposition(Update);

        if (c == 1) {
            UserObjList.get(number).setUserName(newvar);
            return true;

        }

        else if (c == 2) {
            UserObjList.get(number).setEmail(newvar);
            return true;

        }

        else if (c ==3 ) {
            UserObjList.get(number).setPassword(newvar);
            return true;


        }

        return false;
    }




    public UserInf QueryOBJ(String var) {

        UserInf ob = findOBJposition (var);
        // the array list, and return the object that has the name
        // the whole fucking object stored in the array list
        // so query is a reference
        return ob;   //That gonna look inside the object that stored inside

    }







    public int findOBJposition(UserInf CheckMeObj) {
        // you will need it in update and query
        for (int i = 0; i < UserObjList.size(); i++) {
            if (UserObjList.get(i).getUserName().equals(CheckMeObj.getUserName()) ||
                    UserObjList.get(i).getEmail().equals(CheckMeObj.getEmail())) {
                return i;
            }
        }
        return -1;

    }


    public UserInf findOBJposition(String var) {

        for (int i = 0; i < UserObjList.size(); i++) {
            if (UserObjList.get(i).getUserName().equals(var)) {
              return   UserObjList.get(i);
            }

        }
       return null;

    }



             public void outputCurrentUsers(){


                             for (int i =0; i<UserObjList.size();i++){
                                 System.out.println(" name :"+UserObjList.get(i).getUserName()+"\n email"+
                                         UserObjList.get(i).getEmail()+"\n pass:"+
                                         UserObjList.get(i).getPassword());

                             }


}

}
