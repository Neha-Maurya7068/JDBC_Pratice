package generics;

public class MyGeneric {

//	Object obj;
//	
//	MyGeneric(Object obj){
//		this.obj = obj;
//	}
//	
//	void display() {
//		System.out.println("Object Is : "+obj);
//	}
	
	private Object obj;
	public Object getValue() {
		return obj;
		
	}
	public void setValue(Object obj) {
		this.obj = obj;
	}
}
