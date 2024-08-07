package amazon;

import java.util.*;

public class PrintRightBinaryTree_old {

    static Queue<Integer> que = new PriorityQueue<>((a, b) -> (b - a));
    static int k = 3;
    static int maxHeight;
    static int MIN_VALUE = Integer.MIN_VALUE;

    static void printRightView(Node root, int level, Map<Integer, Integer> mp) {


        if (root == null) {
            return;
        }
        maxHeight = Math.max(MIN_VALUE, level);
        // System.out.println("Level is " + level + " root value is " + root.nodeValue);
        mp.put(level, root.nodeValue);//for right tree print use mp.put, for left tree use mp.putIfAbsent

        // System.out.println("Left " + "root.left is " + root.left + " leve is " + (level + 1) + "map is" + mp);
        printRightView(root.left, level + 1, mp);

        // System.out.println("RIGHT " + "root.right is " + root.right + " leve is " + (level + 1) + "map is" + mp);
        printRightView(root.right, level + 1, mp);
    }

    static void printRightView(Node root) {

        Map<Integer, Integer> mp = new HashMap<>();

        printRightView(root, 1, mp);

        mp.forEach((k, v) -> {
            que.add(k);
        });
       /* while (--k > 0) {
            que.poll();
        }*/
        que.stream().forEach(e -> System.out.println(e));
        System.out.println("maxHeight" + maxHeight);

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

        printRightView(root);
    }
}

class Node {
    int nodeValue;
    Node left = null, right = null;

    Node(int value) {
        this.nodeValue = value;
    }
}