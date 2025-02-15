package dsa;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node (int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node { " +
                    "value = " + value +
                    ", next = " + next +
                    '}';
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head = " + head +
                ", tail = " + tail +
                ", length = " + length +
                '}';
    }
}
