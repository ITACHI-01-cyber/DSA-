import java.util.*;

// DOUBLY LINKED LIST IMPLEMENTATION +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// class Node{
//     int data;
//     Node next,prev;  

//     Node(int data){
//         this.data = data;
//         this.next = null;
//         this.prev = null;
//     }
// }
// public class DoublyLL {
//      Node head;

//      void add (int data){
//          Node newNode = new Node(data);
//          if (head == null){
//              head = newNode;
//              return;
//          }
//          Node temp = head;
//          while (temp.next != null){
//              temp = temp.next;
//          }
//          temp.next  = newNode;
//          newNode.prev = temp;
//      }

//      void Print(){
//          Node temp = head;
//          System.out.print("null <-> ");
//          while (temp != null){
//              System.out.print(temp.data + " <-> ");
//              temp = temp.next;
//          }
//          System.out.println("null");
//      }

//      void main(){
//          DoublyLL dbl = new DoublyLL();
//          dbl.add(10);
//          dbl.add(20);
//          dbl.add(30);
//          dbl.add(40);
//          dbl.add(50);
//          dbl.Print();
//      }
// }

// Opreation in Doubly Linked List
    //Insertion begening,last,Specific

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.next = null;
        this.data = data;
        this.prev = null;
    }
}

public class DoublyLL {
    Node head;

    void insertLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void InsertBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void InsertSpecific(int pos,int data){
        if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (pos == 1) {
            InsertBeg(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
        System.out.println(data + " inserted at position " + pos);
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
         dbl.insertLast(10);
         dbl.insertLast(20);
         dbl.insertLast(30);
         dbl.insertLast(40);
         dbl.insertLast(50);
         dbl.Print();
         dbl.InsertBeg(05);
         dbl.Print();
         dbl.InsertSpecific(03,25);
         dbl.Print();
    }
}