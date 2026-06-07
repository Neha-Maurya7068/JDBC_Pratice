package homework;

import java.util.*;
public class MergeTwoList {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 3, 8, 9);
		
		Set<Integer> set = new LinkedHashSet<>();
		
        set.addAll(list1);
        set.addAll(list2);
        
        List<Integer> result = new  ArrayList<>(set);
        
        System.out.println("Merge two List: "+result);
	}
}
