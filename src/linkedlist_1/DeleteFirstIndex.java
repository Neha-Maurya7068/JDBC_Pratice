package linkedlist_1;

	public class DeleteFirstIndex {

		DeleteNode head;
		
//		**********InsertFirst
		
		void insertFirst(int data) {
			
			DeleteNode newNode = new DeleteNode(data);
			
			newNode.next = head;
			
			head = newNode;	
		}
		
		void deleteFirst() {
			
			if(head == null) {
				
				System.out.println("List is empty");
				return;
			}
			head = head.next;
		}
		void display() {
			
			DeleteNode temp = head;
			
			while(temp != null) {
				System.out.println(temp.data + "-> ");
				temp = temp.next;
			}
			
			System.out.println("null");
			
			}
		
		public static void main(String[] args) {
			DeleteFirstIndex list = new DeleteFirstIndex();
			
			list.insertFirst(30);
			list.insertFirst(40);
			list.insertFirst(50);
			list.insertFirst(60);
			list.insertFirst(70);
			list.insertFirst(80);
			
            System.out.println("Before delete");
			list.display();	
			
			list.deleteFirst();
			
			System.out.println("After Delete");
			list.display();
		}
	}
	class DeleteNode {
		int data;
		DeleteNode next;
		
		 DeleteNode(int data){
			this.data = data;
			this.next = null;
		}
	}
