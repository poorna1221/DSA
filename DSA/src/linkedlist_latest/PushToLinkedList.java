package linkedlist_latest;

public class PushToLinkedList {
    Node head;
    Node tail;
    int size;

    public void pushToLinkedListAtBegin(int nodeValue) {
        Node newNode = new Node();
        newNode.nodeValue = nodeValue;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void pushToLinkedListAtEnd(int nodeValue) {
        Node newNode = new Node();
        if (head == null) {
            newNode.nodeValue = nodeValue;
            newNode.next = head;
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.nodeValue = nodeValue;
            newNode.next = null;//last node in SLL next will be null
            tail.next = newNode;//Tail.next will have previous node refernece, so with this step we are creating link
            //between new node and last node in the linked list which is node before tail. as preivious if block as we set tail =new node
            //tail.next will have node reference
            tail = newNode;
            size++;
        }

    }

    public void getNthNode(int targetNode) {

        Node tempNode = head;
        int count = 0;
        while (count < targetNode - 1) {

            tempNode = tempNode.next;
            System.out.println("inside loop" + tempNode.nodeValue);
            count++;
        }
        System.out.println("Nth node is " + tempNode.nodeValue);

    }

    public void iterateLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.nodeValue);
            if (i != size - 1)
                System.out.print("->");
            tempNode = tempNode.next;
        }

    }

    public void printFirstAndLastNodevalues() {
        System.out.println("First node value is" + head.nodeValue);
        System.out.println("First node value is" + tail.nodeValue);
    }

    public static void main(String[] args) {
        PushToLinkedList ll = new PushToLinkedList();
        ll.pushToLinkedListAtBegin(2);
        ll.pushToLinkedListAtBegin(3);
        ll.pushToLinkedListAtBegin(6);
        ll.pushToLinkedListAtBegin(7);
        // ll.getNthNode(2);
        ll.iterateLL();
        /*ll.pushToLinkedListAtEnd(2);
        ll.pushToLinkedListAtEnd(3);
        ll.pushToLinkedListAtEnd(6);
        ll.pushToLinkedListAtEnd(7);
        ll.printFirstAndLastNodevalues();*/

    }

    static class Node {
        int nodeValue;
        Node next;
    }
}
