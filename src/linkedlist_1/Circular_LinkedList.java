package linkedlist_1;

public class Circular_LinkedList {

	  
	CircularNode head;


	    void insertFirst(int data) {

	        CircularNode newNode = new CircularNode(data);

	        if (head == null) {

	            head = newNode;

	            newNode.next = head;

	            return;
	        }

	        CircularNode temp = head;

	        while (temp.next != head) {

	            temp = temp.next;
	        }

	        newNode.next = head;

	        temp.next = newNode;

	        head = newNode;
	    }
	    
	    void display() {

	        if (head == null) {

	            System.out.println("List is Empty");
	            return;
	        }

	        CircularNode temp = head;

	        do {

	            System.out.print(temp.data + " -> ");

	            temp = temp.next;

	        } while (temp != head);

	        System.out.println("(head)");
	    }

	    public static void main(String[] args) {

	        Circular_LinkedList list = new Circular_LinkedList();

	        list.insertFirst(10);
	        list.insertFirst(20);
	        list.insertFirst(30);
	        list.insertFirst(40);

	        list.display();
	    }
	}
	
class CircularNode {

    int data;

    CircularNode next;

    CircularNode(int data) {

        this.data = data;

        this.next = null;
    }
}
