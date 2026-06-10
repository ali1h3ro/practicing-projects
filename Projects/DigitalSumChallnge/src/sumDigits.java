public class sumDigits {
    public static int SumDigits(int Number){
        if(Number<10){
 return -1;
        }


        int sum =0;
        while(Number>0){
            int digit = Number % 10;  //5 , 2  , Remember that 1%10=1 and 2%10=2 because 0.1 * 10 =1 watch the modulus explanation...
            sum+= digit; // sum=sum+digit //5+2+


            Number /=10; // Number /=10;  120,12,
            if(Number<10){
                sum-=digit;
                sum-=digit;
            }
        }

        return sum;
    }
}
