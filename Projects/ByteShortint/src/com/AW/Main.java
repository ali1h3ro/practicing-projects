package com.AW;

public class Main {

    public static void main(String[] args) {
        int res=CalculateHighScorePosition(2000);
        HighScorePosition("Ahmed",res);




        res=CalculateHighScorePosition(900);
        HighScorePosition("Fares",res);



        res=CalculateHighScorePosition(400);
        HighScorePosition("Ali",res);



        res=CalculateHighScorePosition(50);
        HighScorePosition("Susa",res);

    }







    public static void HighScorePosition(String Name,int Pos) {
        System.out.println(Name + " manged to get into position " + Pos + " on the score board table ");


    }

    public static int CalculateHighScorePosition(int PlayerScore){



 if (PlayerScore>=1000){
     return 1;
 }

  else if (500<=PlayerScore){
     return 2;

 }

    else if (100<=PlayerScore){
     return 3;

 }




return 4;

    }


}




