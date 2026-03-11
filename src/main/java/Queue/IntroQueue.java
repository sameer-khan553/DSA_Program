package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class IntroQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.poll();
        q.add(12);
       boolean res =  q.isEmpty();
            if(res) {
                System.out.println("Yupp queue is empty");
            }
            else {
                System.out.println("nope! queue is not empty");
                System.out.println("This is queue: " + q);
            }

    }
}
