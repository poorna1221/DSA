package DeleteMePractice;

public class pushTOLL {

    Node head, tail = null;
    int size = 0;

    public void pushAtBegin(int nodeValue) {
        Node newNode = new Node();
        newNode.nodeValue = nodeValue;
        newNode.next = head;
        head = newNode;
        tail = newNode;
        size++;
    }

    public void pushAtEnd(int nodeValue) {

        if (head == null) {
            Node newNode = new Node();
            newNode.nodeValue = nodeValue;
            newNode.next = head;
            head = newNode;
            tail = newNode;
            size++;
        } else {
            Node newNode = new Node();
            newNode.nodeValue = nodeValue;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

    public void printLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.nodeValue);
            if (i != size - 1) System.out.print("->");
            tempNode = tempNode.next;
        }
    }

    public void getNthNode(int nodeLevel) {
        Node tempNode = head;
        for (int i = 0; i < nodeLevel - 1; i++) {
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.next.nodeValue);
    }

    public void printMiddel() {
        int middelNode = size / 2;
        Node tempNode = head;
        while (middelNode != 0) {
            tempNode = tempNode.next;
            middelNode--;
        }
        System.out.println("middle value is " + tempNode.nodeValue);

    }

    public static void main(String[] args) {
        pushTOLL ll = new pushTOLL();
        ll.pushAtBegin(2);
        ll.pushAtBegin(4);
        ll.pushAtBegin(6);
        ll.pushAtBegin(8);
        ll.pushAtBegin(9);
        ll.pushAtBegin(3);
        ll.printLL();
        ll.printMiddel();
        //ll.getNthNode(2);
    }

    class Node {
        int nodeValue;
        Node next;
    }

}
