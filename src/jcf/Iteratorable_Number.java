package jcf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iteratorable_Number {
	
	public static void main(String[] args) {
		
//		List<Integer> n1 = Arrays.asList(2,4,5,7,8,9,5,2,3,4,5,6,7);
//		
//		Iterator<Integer> it = n1.iterator();
//
//		while(it.hasNext()) {
//			Integer num = it.next();
//			if(num % 2 == 0) {
//				System.out.println(num + " ");
//			}
//		}
		
		
		
//		List<String> l1 = Arrays.asList("Mohan", "Rohan", "Ram");
//	
//			Iterator<String> it = l1.iterator();
//	
//			while (it.hasNext()) {
//				System.out.println(it.next());
//	}
//		
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
//		for(int i = 0; i < l1.size(); i++) {
//			System.out.println(l1.get(i)*2);
//		}
		
		l1.add(1,50);
		System.out.println(l1);
		
		
		
	}

}
