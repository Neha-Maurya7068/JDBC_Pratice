package typecasting;

public class AutoboxingDriver {

	public static void main(String[] args) {
		
//		Child c1 = new Child();
//		c1.eat();
//		c1.earn();
//				
//		Parent p1 = new Parent();
//		p1.eat();
//		p1.earn();
		
		//Autoboxing***************Upcasting
		
//		Parent p1 = new Child();
//		p1.earn();
//		p1.eat();
		
		
		//DownCasting***************
	    //System.out.println(p1);

		Parent p1 = new Child();       
       Child c1 = (Child)p1;
       
       c1.earn();
       c1.eat();
		
	}
}
