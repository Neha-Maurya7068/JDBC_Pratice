package linkedlist_1;

public class ReverseLinkedList {

	    ReverseNode head;


	    void insertFirst(int data) {

	        ReverseNode newNode = new ReverseNode(data);

	        newNode.next = head;

	        head = newNode;
	    }


	    void reverse() {

	        ReverseNode prev = null;
	        ReverseNode current = head;
	        ReverseNode next = null;

	        while (current != null) {

	            next = current.next;   

	            current.next = prev;   

	            prev = current;        

	            current = next;        
	        }

	        head = prev;
	    }


	    void display() {

	        ReverseNode temp = head;

	        while (temp != null) {

	            System.out.print(temp.data + " -> ");

	            temp = temp.next;
	        }

	        System.out.println("null");
	    }

	    public static void main(String[] args) {

	        ReverseLinkedList list = new ReverseLinkedList();

	        list.insertFirst(10);
	        list.insertFirst(20);
	        list.insertFirst(30);
	        list.insertFirst(40);
	        list.insertFirst(50);

	        System.out.println("Before Reverse");
	        list.display();

	        list.reverse();

	        System.out.println("After Reverse");
	        list.display();
	    }
	}


	class ReverseNode {

	    int data;
	    ReverseNode next;

	    ReverseNode(int data) {

	        this.data = data;
	        this.next = null;
	    }
	}

