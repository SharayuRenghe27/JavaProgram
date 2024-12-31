package Task.Nov.list_set_collection;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        //FIFO
        PriorityQueue pq=new PriorityQueue();
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        pq.offer(6);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
