package our_set;

import java.util.TreeSet;

public class Tree_Set {

	
	public static void main(String[] args) {
		
		TreeSet<Integer> t1 = new TreeSet<>();
		
		t1.add(10);
		t1.add(20);
		t1.add(30);
		t1.add(40);
		t1.add(10);
//        t1.add(null);
		System.out.println(t1);
	}
}
