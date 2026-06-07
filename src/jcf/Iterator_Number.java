package jcf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_Number {

	public static void main(String[] args) {
		
		List<Integer> n1 = Arrays.asList(1,3,4,5,6,7,8,2,9);
		
		Iterator<Integer> it = n1.iterator();
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		while(it.hasNext()) {
			Integer num = it.next();
			if(num % 2 == 0) {
				System.out.println(num + " ");
			}
		}
	}
}
