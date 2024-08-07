package DeleteMePractice;

public class SearchForNodeInTree {

    private static int target = 9;
    static boolean valueFound = false;

    static void searchForNodeValue(Node node) {

        if (node == null) {
            return;
        }
        if (node.nodeValue == target) {
            valueFound = true;
            return;
        }
        searchForNodeValue(node.left);
        searchForNodeValue(node.right);


    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.left = new Node(5);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        searchForNodeValue(root);

        if (valueFound)
            System.out.println("Element is present in the binary tree");
        else
            System.out.println("Element is not present in the binary tree");
    }

    public static class Node {
        int nodeValue;
        Node left, right = null;

        Node(int nodeValue) {
            this.nodeValue = nodeValue;
        }

    }
}
