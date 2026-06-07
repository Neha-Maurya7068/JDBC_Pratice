package linkedlist_1;

class MyNode {
	int data;
	MyNode next;
	
	MyNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class FirstIndexLinkedList {

	MyNode head;
	
//	**********InsertFirst
	
	void insertFirst(int data) {
		
		MyNode newNode = new MyNode(data);
		
		newNode.next = head;
		
		head = newNode;	
	}
	void display() {
		
		MyNode temp = head;
		
		while(temp != null) {
			System.out.println(temp.data + "-> ");
			temp = temp.next;
		}
		
		System.out.println("null");
		
		}
	
	public static void main(String[] args) {
		FirstIndexLinkedList list = new FirstIndexLinkedList();
		
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(50);
		list.insertFirst(60);
		list.insertFirst(70);
		list.insertFirst(80);

		list.display();	
	}
}


