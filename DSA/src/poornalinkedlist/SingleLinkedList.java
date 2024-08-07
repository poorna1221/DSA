package poornalinkedlist;

public class SingleLinkedList {
    Node head, tail;

    public Node createSingleLinkedList(int nodeValue) {

        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;

        return head;
    }
}
