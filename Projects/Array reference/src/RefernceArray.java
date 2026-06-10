import java.util.Arrays;

public class RefernceArray {
    public static void main(String[] args) {




        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;


        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));


    }

    private static void modifyArray(int[] array) {

        array[0] = 5;
        array = new int[] {1, 2, 3, 4, 5};
        array[0] = 2;


    }
}
