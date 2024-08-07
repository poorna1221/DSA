package linkedlist_latest;

public class SingleListList {

    public Node head;
    public Node tail;
    public int size;
    boolean valueFound = false;

    public Node createSingleLinkedList(int nodeValue) {
        //head = new Node();
        Node node = new Node();
        node.nodeValue = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size++;
        return head;

    }

    //location = 0, inserts at beginnging
    public void insertIntoLinkedList(int nodeValue, int location) {

        Node node = new Node();
        node.nodeValue = nodeValue;
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;

        } else if (location >= size) {
            node.next = null;
            tail.next = node;//missed this
            tail = node;

        } else {
            int index = 0;
            Node tempNode = head;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseSingleLinkedList() {
        if (head == null) {
            System.out.println("SLL doesn't exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.nodeValue);
                if (i != size - 1) System.out.print("->");
                tempNode = tempNode.next;
            }

        }
        System.out.println("---------");
    }

    public void getNthNodeLinkedList(int targetNode) {

        Node tempNode = head;
        int count = 0;

      /*  while (count < targetNode - 1) {
            tempNode = tempNode.next;
            count++;
        }*/
        while (tempNode != null) {
            if (count == targetNode) {
                System.out.println("Nth node is " + tempNode.nodeValue);
            }
            count++;
            tempNode = tempNode.next;
        }

    }

    public void lengthOfLL() {
        Node tempNode = head;
        int count = 0;
        while (tempNode.next != null) {
            count++;
            tempNode = tempNode.next;
        }
        System.out.println("Count is  " + (count + 1));
    }

    public void printNodeBeforeAndAfterNode(int targetNode) {

        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.nodeValue != targetNode) {
                tempNode = tempNode.next;
            } else {
                System.out.println(tempNode.next.nodeValue);
            }
        }

    }

    public void searchValueInLinkedList(int targetValue) {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (targetValue == tempNode.nodeValue) {
                valueFound = true;
                break;
            }
            tempNode = tempNode.next;
        }

        if (valueFound) System.out.println("Value is found in linked list");
        else
            System.out.println("Not Found");
    }

    public void deleteValueInLinkedList(int location) {


        if (head == null) {
            System.out.println("Linked list not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteEntireLinkedList() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        SingleListList sll = new SingleListList();
        sll.createSingleLinkedList(5);
        sll.insertIntoLinkedList(6, 1);
        sll.insertIntoLinkedList(7, 2);
        sll.insertIntoLinkedList(8, 3);
        sll.insertIntoLinkedList(9, 4);
        sll.insertIntoLinkedList(10, 5);
        sll.traverseSingleLinkedList();
        sll.lengthOfLL();
        sll.printNodeBeforeAndAfterNode(8);
        sll.getNthNodeLinkedList(13);

     /*   System.out.println(sll.head.nodeValue);
        System.out.println(sll.head.next);
        System.out.println(sll.head.next.nodeValue);
        System.out.println(sll.head.next.next);
        System.out.println(sll.tail.nodeValue);
        System.out.println(sll.tail.next);*/


        //Node head = sll.createSingleLinkedList(2);
       /* System.out.println(sll.head.nodeValue);
        System.out.println(sll.head.next.nodeValue);
        System.out.println(sll.head.next.next.nodeValue);
        sll.traverseSingleLinkedList();
        // sll.deleteValueInLinkedList(7);
        sll.deleteEntireLinkedList();
        sll.traverseSingleLinkedList();
        //sll.searchValueInLinkedList(10);*/
    }

    class Node {
        int nodeValue;
        Node next;
        int size = 1;
    }
}
