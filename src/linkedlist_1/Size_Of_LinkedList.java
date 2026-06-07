package linkedlist_1;

public class Size_Of_LinkedList {

	    SizeNode head;


	    void insertFirst(int data) {

	        SizeNode newNode = new SizeNode(data);

	        newNode.next = head;

	        head = newNode;
	    }


	    int size() {

	        int count = 0;

	        SizeNode temp = head;

	        while (temp != null) {

	            count++;

	            temp = temp.next;
	        }

	        return count;
	    }


	    void display() {

	        SizeNode temp = head;

	        while (temp != null) {

	            System.out.print(temp.data + " -> ");

	            temp = temp.next;
	        }

	        System.out.println("null");
	    }

	    public static void main(String[] args) {

	        Size_Of_LinkedList list = new Size_Of_LinkedList();

	        list.insertFirst(10);
	        list.insertFirst(20);
	        list.insertFirst(30);
	        list.insertFirst(40);
	        list.insertFirst(50);

	        System.out.println("Linked List");
	        list.display();

	        System.out.println("Size of List = " + list.size());
	    }
	}


	class SizeNode {

	    int data;
	    SizeNode next;

	    SizeNode(int data) {

	        this.data = data;
	        this.next = null;
	    }
	}

