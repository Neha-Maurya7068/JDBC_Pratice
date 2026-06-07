package homework;

import java.util.*;


public class EvenOddCount {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		int evencount = 0;
		int oddcount = 0;
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			
			if(num % 2 == 0) {
				evencount++;
			}else {
				oddcount++;
			}
		}
		System.out.println("Even Counting: "+evencount);
		System.out.println("Odd Counting: "+oddcount);

	}
}

	


