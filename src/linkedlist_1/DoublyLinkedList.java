package linkedlist_1;

class EveryNode {

    int data;

    EveryNode prev;
    EveryNode next;

    EveryNode(int data) {

        this.data = data;

        this.prev = null;
        this.next = null;
    }

}

public class DoublyLinkedList {

	EveryNode head;
	
    void insertFirst(int data) {

        EveryNode newNode = new EveryNode(data);

        if (head == null) {

            head = newNode;
            return;
        }

        newNode.next = head;

        head.prev = newNode;

        head = newNode;
           
    }
    
    void display() {

        EveryNode temp = head;
        
        System.out.print("null <- ");
        while (temp != null) {
            System.out.print(temp.data);
            if(temp.next != null) {
            System.out.print(" ⇄ ");
            }
            temp = temp.next;

        }

        System.out.println(" -> null");
    }
    
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();
    }
}



