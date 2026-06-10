package com.AW;

public class Main {

    public static void main(String[] args) {
        System.out.println(Hours(50,36346));
        System.out.println(Hours(6456));
    }


    public static String Hours(int Minutes ,int Seconds){
        if ((Minutes>=0) || (Seconds >=0) || (Seconds<=59)){

                double Hsum = (Seconds/3600)+(Minutes/60);

            return +Seconds+" Seconds ,"+Minutes+" Minutes ,"+Hsum+" Hours";
}
return "Invalid value";
}
    public static String Hours(int Seconds){
        if(Seconds>=0){

         int Minutes = (Seconds/60);

       return    Hours(Minutes,Seconds);


        }

        return "Invalid Value";
}

}
