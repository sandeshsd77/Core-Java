package collectionn.Linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();


        SinglyLinkedList.Node n1 = new SinglyLinkedList.Node();
        SinglyLinkedList.Node n2 = new SinglyLinkedList.Node();
        SinglyLinkedList.Node n3 = new SinglyLinkedList.Node();
        SinglyLinkedList.Node n4 = new SinglyLinkedList.Node();
        SinglyLinkedList.Node n5 = new SinglyLinkedList.Node();

        n1.val = 10;
        n2.val = 20;
        n3.val = 30;
        n4.val = 40;
        n5.val = 50;

        n1.next = n2;

        n2.next = n3;

        n3.next = n4;

        n4.next = n5;

        System.out.println(" n1 address -> " + n1.hashCode()  );
        System.out.println(" n2 address -> " + n2.hashCode()  );
        System.out.println(" n3 address -> " + n3.hashCode()  );
        System.out.println(" n4 address -> " + n4.hashCode()  );
        System.out.println(" n5 address -> " + n5.hashCode()  );

//
//        System.out.println(n1.next.next.next.next.next.hashCode());
//        System.out.println(n1.next);

        System.out.println(list.middle(n1).hashCode());
        list.display(n1);


    }
}
