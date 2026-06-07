package homework;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> reversed = new ArrayList<>();
		
		for(int i = list.size() -1; i >= 0; i--) {
			reversed.add(list.get(i));
			
		}
		System.out.println("Reversed List: "+reversed);
	}
}
