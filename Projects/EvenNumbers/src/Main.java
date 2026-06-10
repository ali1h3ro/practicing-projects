public class Main {
    public static void main(String[] args) {

        int number=0;
        int FinishNumber=20;
        int sum=0;
        int count=0;


        while(number<=FinishNumber){
            number++;

if(!Even.IsEvenNumber(number)){
    continue;
}
            count++;



            System.out.println(number);
            if (count==5){
                System.out.println("Total even numbers = "+count);
                break;
            }
        }



    }
}
