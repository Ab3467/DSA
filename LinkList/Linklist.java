import java.util.*;

class Linkedlist {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void FirstAdd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void lastAdd(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
            
        }
        currNode.next = newNode;
    }
    
    public void print() {
        if (head == null) {
            System.out.print("Empty List");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        Linkedlist linklist = new Linkedlist();
        linklist.FirstAdd("is");
        linklist.FirstAdd("This");
        linklist.lastAdd("LinkList");
        linklist.print();
    }
}
