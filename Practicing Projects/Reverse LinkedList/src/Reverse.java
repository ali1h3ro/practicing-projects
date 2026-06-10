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


    public static void main(String[] args) {

        Reverse linkedLisr = new Reverse();

        
        linkedLisr.addList(1);
        linkedLisr.addList(2);
        linkedLisr.addList(3);
        linkedLisr.addList(4);
        linkedLisr.addList(5);

        linkedLisr.addList(6);
        linkedLisr.addList(7);
        linkedLisr.addList(8);
        linkedLisr.addList(9);
        linkedLisr.addList(10);

        System.out.println(linkedLisr.getNumnbers().toString());
        reverseLinkedList(linkedLisr.getNumnbers());
        System.out.println(linkedLisr.getNumnbers().toString());

    }

    public static void reverseLinkedList(LinkedList<Integer> list) {


        ListIterator<Integer> iterable = list.listIterator();

        List
        for (int i = 0; i < 20; i++) {
            if (iterable.hasNext()) {
                int current = iterable.next();
                int next = iterable.next();
                iterable.previous() = iterable.next();
                iterable.previous();
                iterable.set(next);
                iterable.next();
                iterable.next();
            }
                   reverseLinkedList(list);

        }


//        public static void printLinkedList (LinkedList < Integer > list) {
//
//
//        }


    }
}
