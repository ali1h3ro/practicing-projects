public class calcFeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters2(double Feet,double Inches){
        if((Feet<0)||(Inches <0 || Inches>12)){
            System.out.println("Invalid input");
    return -1;
        }

        double  Inchtocm = (Inches*2.54);  // cm from inches
        double  Feetocm = (Feet*30.48);    // cm from feet
        double cm = Inchtocm+Feetocm;

        System.out.println("Feet to cm = "+Feetocm+"cm, Inch to cm = "+Inchtocm+" cm total cm = "+cm);



        return cm;





    }
    public static double calcFeetAndInchesToCentimeters2(double Inches){
        if (Inches>=0){

                double  feet =(Inches/12);
            System.out.println("Inches To feet "+feet);
          return   calcFeetAndInchesToCentimeters2(feet,Inches);
        }

        return -1;
    }


    }
