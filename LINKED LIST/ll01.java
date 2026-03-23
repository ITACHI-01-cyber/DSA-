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

// class Node{
//    int data;
//    Node next;

//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
// }

// public class ll01 {
//    Node head;

//    void add(int data){
//        Node newNode = new Node(data);
//        if (head == null){
//            head = new Node(data);
//            return;
//        }
//        Node Last = head;
//        while (Last.next != null){
//            Last = Last.next;
//        }
//        Last.next = new Node(data);
//    }

//    void Print(){
//        Node current = head;

//        while (current != null){
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("NULL");
//    }

//    void  InsertionBeganing(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    void main(){
//        ll01 List = new ll01();

//        List.add(20);
//        List.add(30);
//        List.add(40);
//        List.InsertionBeganing(10);
//        List.Print();
//    }
// }


// INSERTION AT END OF LIST ==================================================>>>>>>>>>>>>>>>>>>>>>>>>>>>

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class ll01 {
//    Node head;
//
//    void addLast(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = newNode;
//    }
//
//    void insertAtEnd(int data) {
//        addLast(data);
//    }
//
//    void print() {
//        Node current = head;
//        if (current == null) {
//            System.out.println("List is empty");
//            return;
//        }
//        while (current != null) {
//            System.out.print(current.data + " → ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//        void main(String[] args) {
//        ll01 list = new ll01();
//
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.insertAtEnd(50);
//
//        list.print();
//    }
//}

// INSETION AT SPECIFIC POSITION =====================>>>>>>>>>>>>>>>>>

// InsertAtPosition.java
//class Node {
//    int data;
//    Node next;
//    Node(int data) { this.data = data; }
//}
//
//public class ll01 {
//    Node head;
//
//    boolean insertAtPosition(int pos, int data) {
//        if (pos < 0) return false;
//
//        Node newNode = new Node(data);
//
//        if (pos == 0) {
//            newNode.next = head;
//            head = newNode;
//            return true;
//        }
//
//        Node current = head;
//        int count = 0;
//
//        while (current != null && count < pos - 1) {
//            current = current.next;
//            count++;
//        }
//
//        if (current == null) return false;
//
//        newNode.next = current.next;
//        current.next = newNode;
//        return true;
//    }
//
//    void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " → ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//        void main(String[] args) {
//        ll01 list = new ll01();
//        list.head = new Node(10);
//        list.head.next = new Node(20);
//        list.head.next.next = new Node(40);
//
//        System.out.print("Before: ");
//        list.print();
//
//        list.insertAtPosition(2, 30);
//        list.insertAtPosition(0, 5);
//
//        System.out.print("After:  ");
//        list.print();   // 5 → 10 → 20 → 30 → 40 → null
//    }
//}























