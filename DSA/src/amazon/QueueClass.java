package amazon;

import java.util.*;

public class QueueClass {
    static void tF() {
        Queue<Integer> qa = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            qa.offer(i);//qa.add(i); //if queue is full add thorws error, while offer returns false.
        }

        System.out.println(qa.remove());//remove or poll almost same, if queue is empty remove throws error but poll returns null
        System.out.println(qa.peek());
        System.out.println(qa.poll());
        System.out.println(qa.element());//peek or element used to fetch top of queue element withotut deleting them
        //if queue is empty poll returns null while element throws error
        System.out.println(qa.poll());
        System.out.println("Size of queue is " + qa.size());
        qa.clear();
        System.out.println(qa.peek());
        System.out.println("status of element 3 in queue " + qa.contains(6));
    }

    static void sortQueue() {

        Queue<Integer> qi = new PriorityQueue<>((a, b) -> (b - a));

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            qi.add(rand.nextInt(100));
        }

  /*      qi.stream().forEach(System.out::println);
        System.out.println("---");
        for (int i = 0; i < 10; i++) {
            System.out.println(qi.poll());
        }*/
       /* for (int i : qi) {
            System.out.println(i);
        }
        System.out.println("------------");

        System.out.println(qi.poll());
        System.out.println(qi.poll());*/

    }

    public static void MaxQueueElement2() {
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();

        Q1.add(2);
        Q1.add(1);
        Q1.add(4);
        Q1.add(6);
        Q1.add(5);

        int maxElement = Q1.peek();
        Iterator<Integer> iter = Q1.iterator();

        while (iter.hasNext()) {
            if (maxElement > iter.next()) {
                Q2.add(maxElement);
                Q1.add(maxElement);

            }
        }

        for (int i : Q2) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        sortQueue();
    }
}
