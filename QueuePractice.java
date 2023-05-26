import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {

        System.out.println("=====-Queue-=====");
        Queue<Integer> q = new PriorityQueue<>();
        //Same as queue similar functionality
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);

        System.out.println("Removing 1 st element as queue follows FIFO and return null if queue empty");
        System.out.println(q.poll());
        System.out.println(q);
        
        System.out.println("It also remove element but return runtime error if queue is empty");
        System.out.println(q.remove());
        System.out.println(q);

        System.out.println("Gives Head element and return null if queue is empty");
        System.out.println(q.peek());

        System.out.println("Gives Head element and return runtime error if queue is empty");
        System.out.println(q.element());

    }
}