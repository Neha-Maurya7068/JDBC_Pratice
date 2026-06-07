package homework;

import java.util.*;

public class ReplaceEven {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,7,8));
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				list.set(i, 0);
			}
		}
		System.out.println("New List: "+list);
	}
}
