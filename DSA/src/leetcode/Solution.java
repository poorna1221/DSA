package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    static ListNode head1, head2;

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> ls = new ArrayList<Integer>();
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            sum = sum + carry;
            if (sum > 9) {
                int n = sum % 10;
                carry = sum / 10;
                ls.add(n);
            } else {
                ls.add(sum);
                carry = 0;
            }
        }
        if (carry != 0) {
            ls.add(carry);
        }

        List<Integer> lsNode = new LinkedList<Integer>();
        for (int i = 0; i < ls.size(); i++) {
            lsNode.add(ls.get(i));
        }
       /* ListNode output = null;
        for (int i = ls.size() - 1; i >= 0; i--) {
            //System.out.println(ls.get(i));
            ListNode n = new ListNode(ls.get(i), output);
            output = n;
        }
        */
        //print((LinkedList) lsNode);
        return (ListNode) lsNode;
    }

  /*  public static void print(LinkedList l) {
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }*/

    public static void main(String[] args) {
        Solution s = new Solution();
        s.head1 = new ListNode(1);
        s.head1.next = new ListNode(2);
        s.head1.next.next = new ListNode(9);


        s.head2 = new ListNode(9);
        s.head2.next = new ListNode(8);
        s.head2.next.next = new ListNode(6);

        addTwoNumbers(s.head1, s.head2);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
