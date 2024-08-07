package amazon;

import java.util.HashMap;
import java.util.Map;

public class PrintRightBinaryTreeNew {
    static Map<Integer, Integer> mp = new HashMap<>();
    static int target = 8;
    static boolean valueFound = false;

    static void printRightBinaryTree(Node node, int level, Map<Integer, Integer> map) {

        if (node == null) return;

        map.put(level, node.nodeValue);//mp.put to print right subtree, mp.putIfAbsebt to print left sub tree.
        if (node.nodeValue == target) {
            valueFound = true;
            return;
        }

        printRightBinaryTree(node.left, level + 1, map);
        printRightBinaryTree(node.right, level + 1, map);


    }

    static void printRightBinaryTree() {
        mp.forEach((k, v) -> {
            System.out.println("Level is " + k + " tree value is  " + v);
        });


    }

    public static void main(String[] args) {


        int level = 1;

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.left = new Node(5);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        printRightBinaryTree(root, level, mp);
        printRightBinaryTree();
        if (valueFound) System.out.println("node found");
        else System.out.println("not found");

    }

    public static class Node {
        int nodeValue;
        Node left, right = null;

        Node(int nodeValue) {
            this.nodeValue = nodeValue;
        }

    }
}

