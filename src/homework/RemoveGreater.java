package homework;

import java.util.*;
public class RemoveGreater {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 30, 2, 40, 8, 50));
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			 int num = it.next();
			 
			if(num > 10) {
				it.remove();
			}
		}
		System.out.println("New List" +list);
	}
}
