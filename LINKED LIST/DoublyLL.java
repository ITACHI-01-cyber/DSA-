import java.util.*;

// DOUBLY LINKED LIST IMPLEMENTATION +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

class Node{
    int data;
    Node next,prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLL {
     Node head;

     void add (int data){
         Node newNode = new Node(data);
         if (head == null){
             head = newNode;
             return;
         }
         Node temp = head;
         while (temp.next != null){
             temp = temp.next;
         }
         temp.next  = newNode;
         newNode.prev = temp;
     }

     void Print(){
         Node temp = head;
         System.out.print("null <-> ");
         while (temp != null){
             System.out.print(temp.data + " <-> ");
             temp = temp.next;
         }
         System.out.println("null");
     }

     void main(){
         DoublyLL dbl = new DoublyLL();
         dbl.add(10);
         dbl.add(20);
         dbl.add(30);
         dbl.add(40);
         dbl.add(50);
         dbl.Print();
     }
}