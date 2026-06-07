package ourqueue;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> aq = new ArrayDeque<>();
		
		aq.add(10);
		aq.add(20);
		aq.add(30);
		aq.add(40);

//		System.out.println(aq.remove());
		
		aq.add(50);
//		System.out.println(aq);
		
		aq.addFirst(5);
		aq.addLast(60);
		System.out.println(aq);

		System.out.println(aq.removeLast());
	}
}
