package amazon;

public class RemoveDuplicateFromSortedLinkedList {
    public void deleteDuplicates(Node head) {

        Node sHead = new Node();
        Node node = head, sTail = sHead;


        while (node != null) {
            while (node != null && node.next.value == node.value) {

                node = node.next;
            }

            Node next = node.next;
            node.next = null;
            sTail.next = node;
            sTail = node;
            node = next;
        }

    }

    public static void main(String[] args) {


    }

    public class Node {

        int value;
        Node next;

        Node() {
        }

        Node(int nodeValue, Node next) {
            this.value = nodeValue;
            this.next = next;
        }
    }
}

