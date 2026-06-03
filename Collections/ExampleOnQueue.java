package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExampleOnQueue {
    public static void main(String[] args){
        Queue<String> que = new PriorityQueue<>();
        que.add("Mehathab");
        que.add("Suhana");
        que.add("Mourvi");
        que.add("Khadeer");
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(30);
        pq.add(70);
        pq.add(65);
        pq.add(37);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
