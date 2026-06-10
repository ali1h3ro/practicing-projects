
public class TheRealWork {
    public static final String INVALID_INPUT = "The input that you entered is wrong";

    public static String printYearsAndDays(long Minutes){

   if(Minutes>0) {
       long yearanddays = (Minutes / 525600);


       return yearanddays+" year, "+ (Minutes / 1440) +" days, "+Minutes+" Minutes.";
   }




   return INVALID_INPUT;
    }


}
