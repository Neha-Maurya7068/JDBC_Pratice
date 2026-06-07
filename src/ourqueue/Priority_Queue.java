package ourqueue;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		
		pq1.add(50);
		pq1.add(40);
		pq1.add(30);
		pq1.add(10);
		pq1.add(20);
		
		System.out.println(pq1);
		System.out.println(pq1.peek());
		
		while(!pq1.isEmpty()) {
			System.out.println(pq1.poll());

		}

		
	}
}
