package poornalinkedlist;

public class ArraryToLinkedList {


    static Node insert(Node nextNode, int nodeValue) {

        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = nextNode;
        nextNode = newNode;
        return nextNode;
    }

    static Node arrayToList(int[] arr) {

        Node nextNode = null;

        for (int i = 0; i < arr.length; i++) {
            nextNode = insert(nextNode, arr[i]);
        }

        return nextNode;

    }

    static void display(Node root) {
        while (root != null) {
            System.out.print(root.value + " ");
            root = root.next;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Node root = arrayToList(arr);
        display(root);

    }
}
