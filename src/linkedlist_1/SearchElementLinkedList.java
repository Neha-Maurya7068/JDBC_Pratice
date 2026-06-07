package linkedlist_1;

public class SearchElementLinkedList {

	    SearchNode head;


	    void insertFirst(int data) {

	        SearchNode newNode = new SearchNode(data);

	        newNode.next = head;

	        head = newNode;
	    }


	    boolean search(int key) {

	        SearchNode temp = head;

	        while (temp != null) {

	            if (temp.data == key) {

	                return true;
	            }

	            temp = temp.next;
	        }

	        return false;
	    }


	    void display() {

	        SearchNode temp = head;

	        while (temp != null) {

	            System.out.print(temp.data + " -> ");

	            temp = temp.next;
	        }

	        System.out.println("null");
	    }

	    public static void main(String[] args) {

	        SearchElementLinkedList list = new SearchElementLinkedList();

	        list.insertFirst(10);
	        list.insertFirst(20);
	        list.insertFirst(30);
	        list.insertFirst(40);
	        list.insertFirst(50);

	        System.out.println("Linked List");
	        list.display();

	        int key = 30;

	        if (list.search(key)) {

	            System.out.println(key + " Element Found");
	        }
	        else {

	            System.out.println(key + " Element Not Found");
	        }
	    }
	}


	class SearchNode {

	    int data;
	    SearchNode next;

	    SearchNode(int data) {

	        this.data = data;
	        this.next = null;
	    }
	}
