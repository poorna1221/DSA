package DeleteMePractice;

import amazon.MaxHeightOfBinaryTree;

import java.util.HashMap;
import java.util.Map;

public class PrintBinaryTree {

    static Map<Integer, Integer> mp = new HashMap<>();
    static int targetNode = 4;
    static boolean found = false;
    static int maxHeight = Integer.MIN_VALUE;

    public static void getMap(Node node, int level) {
        if (node == null)
            return;

        maxHeight = level > maxHeight ? level : maxHeight;
       /* if (node.nodeValue == targetNode) {
            found = true;
        }*/
        mp.putIfAbsent(level, node.nodeValue);
        getMap(node.left, level + 1);
        getMap(node.right, level + 1);

    }

    public static void printMap() {

       /* mp.forEach((k, v) -> {
            System.out.println("k is " + k + " value is" + v);
        });*/

        for (Map.Entry mpe : mp.entrySet()) {
            System.out.println(mpe.getKey() + " value is" + mpe.getValue());

        }
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
        getMap(root, 1);
        printMap();
        System.out.println(maxHeight);
       /* if (found) System.out.println("node found");
        else System.out.println("not found");*/
    }

    public static class Node {

        int nodeValue;
        Node left, right = null;

        Node(int nodeValue) {
            this.nodeValue = nodeValue;
        }

    }
}
