public class LeapYear {

    public static void IsLeapYear(int year) {


        if (year <= 9999 && year >= 1) {

            if (year % 2 == 0) {

                if (year % 4 == 0 && year % 100 != 0) {
                    System.out.println("Its leap year");
                } else if (year % 4 == 0 && year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Its leap year");

                    } else {
                        System.out.println("It is'nt leap year");

                    }
                }


            }
            else {
                System.out.println("It is'nt leap year");
            }

        }
        else {
            System.out.println("not valid year");
        }

    }
}
