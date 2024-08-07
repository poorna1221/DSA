package amazon;

public class MaxHeightOfBinaryTree {
    static int MIN_VALUE = Integer.MIN_VALUE;
    static int maxHeight = 0;

    static void searchForNodeValue(Node node, int level) {

        if (node == null) {
            return;
        }

        maxHeight = level > maxHeight ? level : maxHeight;

        searchForNodeValue(node.left, level + 1);
        searchForNodeValue(node.right, level + 1);

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

        searchForNodeValue(root, 1);
        System.out.println("maxHeight of tree is" + maxHeight);

    }

    public static class Node {
        int nodeValue;
        Node left, right = null;

        Node(int nodeValue) {
            this.nodeValue = nodeValue;
        }

    }
}
