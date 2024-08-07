package DeleteMePractice;

public class ArrayToLinkedList {
    static Node insertArrValueToLinkedList(Node nextNodeReference, int arrayValue) {

        Node newNode = new Node();
        newNode.nodeValue = arrayValue;
        newNode.next = nextNodeReference;
        nextNodeReference = newNode;
        return nextNodeReference;

    }

    static void displayNode(Node lastNode) {
        while (lastNode != null) {
            System.out.print(lastNode.nodeValue);
            lastNode = lastNode.next;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 3};
        Node nexNodeReference = null;

        for (int i = 0; i < arr.length; i++) {
            nexNodeReference = insertArrValueToLinkedList(nexNodeReference, arr[i]);
        }
        displayNode(nexNodeReference);
    }

    static class Node {
        int nodeValue;
        Node next;

    }
}
