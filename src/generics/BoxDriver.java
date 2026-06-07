package generics;

public class BoxDriver {

	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();
		
//		System.out.println(b1);
//		Box<String> b1 = new Box<String>();
//		
//		Box<Integer> b1 = new Box<>();
//		
//		b1.setValue("Aman");
//		b1.setValue(101);
//		System.out.println(b1);

//		 
//		String result = (String) b1.getValue();
//		int result = (int) b1.getValue();
//		
//		b1.setValue("Neha");
//		String result = b1.getValue();
//		
		b1.setValue(101);
		Integer result = b1.getValue();
		System.out.println(result);
	}
}
