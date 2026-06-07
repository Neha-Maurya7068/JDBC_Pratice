package homework;

import java.util.*;
public class MaximumList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 34, 2, 54, 20, 10, 60, 65, 40);
		
		Iterator<Integer> it = list.iterator();
		
		int max = it.next();
		
		while(it.hasNext()) {
			int num = it.next();
			
			if(num > max) {
				max = num;
			}
		}
		
		System.out.println("Maximum Number: "+max);
	}
}
