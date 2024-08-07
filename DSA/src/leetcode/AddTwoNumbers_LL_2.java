package leetcode;

public class AddTwoNumbers_LL_2 {

    static Node head1, head2;
    static String s3, s4;
    static StringBuilder s1 = new StringBuilder();
    static StringBuilder s2 = new StringBuilder();

    public static String getStringFromLinkedList(Node node) {

        while (node != null) {
            s1.append(node.data);
            node = node.next;
        }
        return s1.reverse().toString();

    }

    public static String getStringFromLinkedList2(Node node) {

        while (node != null) {
            s2.append(node.data);
            node = node.next;
        }
        return s2.reverse().toString();
    }

    public static void sum(int a, int b) {

        int sum = a ^ b;
        int carry = a & b;

        while (carry != 0) {
            carry = carry << 1;

            int tempSum = sum ^ carry;
            int tempCarry = sum & carry;

            sum = tempSum;
            carry = tempCarry;
        }
        System.out.println("sum is" + sum);
    }

    public static void main(String[] args) {
        AddTwoNumbers_LL_2 s = new AddTwoNumbers_LL_2();
        s.head1 = new Node(9);
        s.head1.next = new Node(9);
        s.head1.next.next = new Node(9);
        s.head1.next.next.next = new Node(9);
        s.head1.next.next.next.next = new Node(9);
        s.head1.next.next.next.next.next = new Node(9);
        s.head1.next.next.next.next.next.next = new Node(9);

        s.head2 = new Node(9);
        s.head2.next = new Node(9);
        s.head2.next.next = new Node(9);
        s.head2.next.next.next = new Node(9);


        s3 = getStringFromLinkedList(head1);
        s4 = getStringFromLinkedList2(head2);


        int n1 = Integer.parseInt(s3);
        int n2 = Integer.parseInt(s4);

        sum(243, 13);
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
