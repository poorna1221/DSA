package DeleteMePractice;

import amazon.MaxHeightOfBinaryTree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTree {
    static Map<Integer, Integer> mp = new HashMap<>();
    static int targeElement = 9;
    static boolean eleFound = false;
    static int maxHeight = 0;
    static int leftTreeHeight = 0, rightTreeHeight = 0;

    static void printRightBinaryTree(Node node, int level, Map<Integer, Integer> mpe, String treePosition) {

        if (node == null)
            return;

        if (node.nodeValue == targeElement) {
            eleFound = true;
            return;
        }
        if (level > leftTreeHeight && treePosition.equals("left")) {
            leftTreeHeight = level;
        }
        if (level > rightTreeHeight && treePosition.equals("right")) {
            rightTreeHeight = level;
        }


        mp.putIfAbsent(level, node.nodeValue);

        printRightBinaryTree(node.left, level + 1, mp, "left");
        printRightBinaryTree(node.right, level + 1, mp, "right");


    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.left = new Node(5);
        root.right.left.right = new Node(8);

        printRightBinaryTree(root, 1, mp, "root");

        mp.forEach((k, v) -> {
            System.out.println("Leve is " + k + " node value is" + v);
        });
        if (eleFound)
            System.out.println("node found");
        else
            System.out.println("node not found");

        System.out.println("leftTreeHeight is" + leftTreeHeight);
        System.out.println("rightTreeHeight is" + rightTreeHeight);
    }

    static class Node {
        int nodeValue;
        Node left = null, right = null;

        Node(int nodeValue) {
            this.nodeValue = nodeValue;
        }
    }
}
