package ourqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Our_First {

	
	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<>();
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		
		q1.add(50);
		q1.offer(60);
		
//		System.out.println("Removed:  "+q1.remove());
//		System.out.println("Removed:  "+q1.poll());
		
		System.out.println("Removed:  "+q1.peek());

		System.out.println(q1);

	}
}
