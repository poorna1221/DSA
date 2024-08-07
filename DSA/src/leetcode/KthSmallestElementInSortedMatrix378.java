package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix378 {

    PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> (b - a));

    public int kthSmallest(int[][] matrix, int k) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                queue.add(matrix[i][j]);
                if (queue.size() > k) {
                    queue.poll();
                }
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        KthSmallestElementInSortedMatrix378 tl = new KthSmallestElementInSortedMatrix378();
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};

        int k = 8;
        System.out.println(tl.kthSmallest(matrix, 8));

    }
}