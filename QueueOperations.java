
import java.util.LinkedList;
import java.util.Queue;
public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);

        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);

        queue.peek();
        queue.peek();
        System.out.println(queue);
    }
}