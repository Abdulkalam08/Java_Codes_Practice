package main.trainings.CollectionFrameworks;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExamples {
    public static void main(String[] args) {
        System.out.println("Queue examples");

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements to both ends
        deque.addFirst(10); // Add to the front
        deque.addLast(20);  // Add to the end
        deque.addLast(30);
        deque.addFirst(5);
        deque.addFirst(1);

        //System.out.println("Deque: " + deque); // Output: Deque: [5, 10, 20, 30]

        // Remove elements from both ends
        int first = deque.removeFirst(); // Remove from the front
        int last = deque.removeLast();  // Remove from the end

        //System.out.println("Removed first: " + first); // Output: Removed first: 5
        //System.out.println("Removed last: " + last);  // Output: Removed last: 30
        //System.out.println("Deque after removals: " + deque); // Output: Deque after removals: [10, 20]

        //Check if deque is empty
        //System.out.println("Is deque empty? " + deque.isEmpty()); //Output: false

        //Clear the deque
        deque.clear();
        //System.out.println("Is deque empty after clearing? " + deque.isEmpty()); //Output: true

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);

        //System.out.println("Offer Last : ");
        //dq.forEach(System.out::println);
        dq.clear();

        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerFirst(30);

        //System.out.println("Offer First : ");
        //dq.forEach(System.out::println);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(15);
        pq.add(3);
        pq.add(5);
        pq.add(30);
        pq.add(20);

        pq.forEach(System.out::println);

    }
}
