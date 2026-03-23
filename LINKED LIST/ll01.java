import java.util.*;

// SINGLY LINKED LIST IMPLEMENTATION IN JAVA

// class Node{
//     int data;    // value stored
//     Node next;   // pointer to next node

//     // CONSTRUCTOR
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class ll01 {
//         Node head; // reference to first node (starts as null)

//     //  Add a new node at the END of the list
//         void add(int data){
//             Node newNode = new Node(data); // create new node
//             if(head == null){
//                 head = newNode;
//                 return;
//             }
//             // Traverse to the last node
//             Node last = head;
//             while (last.next != null){
//                 last = last.next;
//             }
//             last.next = newNode;
//         }

//     //  Print the entire list
//         void print(){
//                 Node current = head;
//                 while (current != null){
//                     System.out.print(current.data+" -> ");
//                     current = current.next;
//                 }
//                 System.out.println("NULL");
//         }

//     // Add at the beginning (O(1) time)
//         void addFirst(){
//             Node newNode = new Node(10);
//             newNode.next = head;   // new node points to old head
//             head = newNode;        // head now becomes new node
//         }
//         void main(){
//             ll01 list = new ll01();

//             list.add(20);
//             list.add(30);
//             list.add(40);
//             list.add(50);
//             list.addFirst();        // add at front
//             System.out.println("Singly Linked List:");
//             list.print();
//         }
// }

// SINGLY LINKED LIST OPREATION
    // 1. INSERTION => -> INSERTION AT BEGENING
//                      -> INSERTION AT END
//                      -> INSERTION AT SPECIFIC POSITION


//  INSETION AT BEGINING ================================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

class Node{
   int data;
   Node next;

   Node(int data){
       this.data = data;
       this.next = null;
   }
}

public class ll01 {
   Node head;

   void add(int data){
       Node newNode = new Node(data);
       if (head == null){
           head = new Node(data);
           return;
       }
       Node Last = head;
       while (Last.next != null){
           Last = Last.next;
       }
       Last.next = new Node(data);
   }

   void Print(){
       Node current = head;

       while (current != null){
           System.out.print(current.data + " -> ");
           current = current.next;
       }
       System.out.println("NULL");
   }

   void  InsertionBeganing(int data){
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
   }
   void main(){
       ll01 List = new ll01();

       List.add(20);
       List.add(30);
       List.add(40);
       List.InsertionBeganing(10);
       List.Print();
   }
}

























