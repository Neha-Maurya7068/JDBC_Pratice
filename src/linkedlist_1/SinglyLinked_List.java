package linkedlist_1;

public class SinglyLinked_List {

		Node head;

		// Add *********

		void insert(int value) {
			Node newNode = new Node();
			newNode.data = value;

			if (head == null) {
				head = newNode;
				return;
			}

			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;

		}
		
		// Display ******

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;

			}
			System.out.println("null");
		}

		public static void main(String[] args) {
			SinglyLinked_List l1 = new SinglyLinked_List();

			l1.insert(10);
			l1.insert(20);
			l1.insert(30);
			l1.insert(40);
			l1.insert(50);
			l1.insert(60);
			l1.insert(70);
			l1.display();

		}
	}

	// Insert last
	// display
	// insert first
	// delete first
	// delete last
	// search element
	// size of list
	// reverse list

	// Node Class ************

	class Node {
		int data;
		Node next;

	}

	

