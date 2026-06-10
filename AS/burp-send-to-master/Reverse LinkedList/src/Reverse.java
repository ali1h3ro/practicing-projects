import java.util.*;

public class Reverse {

    public LinkedList<Integer> numnbers;

    public Reverse() {
        this.numnbers = new LinkedList<>();

    }

    public void addList(int number) {
        numnbers.add(number);

    }

    public LinkedList<Integer> getNumnbers() {
        return numnbers;
    }

                private static boolean action = false;
    public static void main(String[] args) {

        Reverse linkedLisr = new Reverse();

        
        linkedLisr.addList(1);
        linkedLisr.addList(2);
        linkedLisr.addList(3);
        linkedLisr.addList(4);
        linkedLisr.addList(5);




        System.out.println(linkedLisr.getNumnbers().toString());
        reverseLinkedList(linkedLisr.getNumnbers());
        System.out.println(linkedLisr.getNumnbers().toString());

    }

    public static void reverseLinkedList(LinkedList<Integer> list) {


       Collections.reverse(list);


//        public static void printLinkedList (LinkedList < Integer > list) {
//
//
//        }


    }
}
