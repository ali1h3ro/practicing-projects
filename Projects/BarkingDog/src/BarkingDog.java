public class BarkingDog {


    public static void Bark(boolean barking, int HourOfDay) {


        if (barking) {
            if (HourOfDay <=5 || HourOfDay >=18 && HourOfDay <=24) {
                System.out.println("The dog is barking at night wake up !!");

            }
           else if(HourOfDay<=24){
                System.out.println("The dog is barking in morning");

            }

        }
        else {

            System.out.println("the dog isn't barking");
        }

    }
}