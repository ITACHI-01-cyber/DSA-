import javax.management.NotificationEmitter;
import java.util.*;

// practice linked list

class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Practice {
    node head;

    // add function to list
    void add(int data){
        Node newnode = new Node(data); // create new node
        if(head == null){
            head = new node(data);
            return;
        }
        // Traverse to the last node
        node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = new node(data);
    }

    // Printing List
    void print(){
    node current = head;
    while (current != null){
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("NULL");
    }

    void  main(){
        Practice list = new Practice();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.print();

    }
}
