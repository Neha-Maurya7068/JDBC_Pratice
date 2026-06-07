package linkedlist_1;

public class LastIndexDelete {

    DeleteLastNode head;

    // ********** Insert First

    void insertFirst(int data) {

        DeleteLastNode newNode = new DeleteLastNode(data);

        newNode.next = head;

        head = newNode;
    }

    // ********** Delete Last Node

    void deleteLast() {

        if (head == null) {

            System.out.println("List is empty");
            return;
        }

        // Agar sirf ek node hai
        if (head.next == null) {

            head = null;
            return;
        }

        DeleteLastNode temp = head;

        // Second last node tak jana
        while (temp.next.next != null) {

            temp = temp.next;
        }

        // Last node delete
        temp.next = null;
    }

    // ********** Display

    void display() {

        DeleteLastNode temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LastIndexDelete list = new LastIndexDelete();

        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);
        list.insertFirst(70);
        list.insertFirst(80);

        System.out.println("Before Delete");
        list.display();

        list.deleteLast();

        System.out.println("After Delete");
        list.display();
    }
}

// ********** Node Class

class DeleteLastNode {

    int data;
    DeleteLastNode next;

    DeleteLastNode(int data) {

        this.data = data;
        this.next = null;
    }
}