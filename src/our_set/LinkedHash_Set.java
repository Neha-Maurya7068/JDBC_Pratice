package our_set;

import java.util.LinkedHashSet;

public class LinkedHash_Set {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(40);
		l1.add(30);
        l1.add(60);
        l1.add(70);
        l1.add(50);
        l1.add(80);
        l1.add(null);
        System.out.println(l1);

		
	}
}
