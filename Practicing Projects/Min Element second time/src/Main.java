import java.util.Scanner;

public class Main {

    
    public static void main(String[] args){


    }

    public static int [] GetInt(){
        Scanner scan = new Scanner(System.in);
        int [] Array = new int[7];
        for (int x =0;x<Array.length;x++){
            Array[x] = scan.nextInt();
        }
        return Array;
    }

    public static int Findmin(int[] GetInt){

        int MinElement = Integer.MAX_VALUE;

        int [] sortIntger = new int[GetInt.length];
        System.arraycopy(GetInt, 0, sortIntger, 0, GetInt.length);
        for(int i = 0;i<GetInt.length;i++){
            if (sortIntger[i]<MinElement){
                      MinElement= sortIntger[i];
            }
        }

        return MinElement;
    }


}
