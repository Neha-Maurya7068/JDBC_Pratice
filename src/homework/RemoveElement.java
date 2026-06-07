package homework;

import java.util.*;

public class RemoveElement {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 20, 50));
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			
			if(num == 20) {
				it.remove();
			}
		}
		System.out.println("Updated List: "+list);
	}
}
