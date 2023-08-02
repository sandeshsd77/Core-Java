package collectionn.Linkedlist;

public class SinglyLinkedList {
    Node head = null;
    Node tail = null;


    static public class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
            this.next= null;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    Node middle(Node head){
        Node rabbit = head;
        Node tortoise = head;

        while(rabbit.next != null){
            rabbit = rabbit.next.next;
            tortoise = tortoise.next;
        }

        return tortoise;
    }
}
