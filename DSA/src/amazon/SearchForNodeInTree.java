package amazon;

public class SearchForNodeInTree {

    private static int target = 7;
    static boolean valueFound = false;
    static int totalSum = 0, leftSum = 0, rightSum = 0;

    static void searchForNodeValue(Node node, String position) {

        if (node == null) {
            return;
        }


      /*  if (node.nodeValue == target) {
            valueFound = true;
            return;
        }*///code to search for a node in a tree

       /* if (position.equals("root")) {
            totalSum = totalSum + node.nodeValue;
        }
        if (position.equals("left")) {
            leftSum = leftSum + node.nodeValue;
        }
        if (position.equals("right")) {
            rightSum = rightSum + node.nodeValue;
        }*/ //To sum all the left tree path & right tree path


        searchForNodeValue(node.left, "left");

        searchForNodeValue(node.right, "right");


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

        searchForNodeValue(root, "root");

        System.out.println("root value" + totalSum);
        System.out.println("left path value" + leftSum);
        System.out.println("right value" + rightSum);
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
