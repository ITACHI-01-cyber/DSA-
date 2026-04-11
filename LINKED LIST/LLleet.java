import java.util.HashSet;
import java.util.*;

// Floyd’s Tortoise and Hare Algorithm (Cycle Detection in Linked List) +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LLleet {
//     Node head;

//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = new  Node(data);
//     }

//     void Print(){
//         Node current = head;
//         while (current != null) {
//         System.out.print(current.data +" -> ");
//             current = current.next;
//         }
//         System.err.println("NULL");
//     }

//     boolean hasCycle(){
//         Node Slow = head;
//         Node Fast = head;

//         while(Fast != null && Fast.next != null){
//             Slow = Slow.next;
//             Fast = Fast.next.next;

//             if(Slow == Fast){
//                 return true;
//             }
//         }

//         return false;
//     }
//         void createCycle(int index) {
//         Node tail = head;
//         Node cycleNode = null;
//         int i = 0;
//         Node cur = head;
//         while (cur.next != null) {
//             if (i == index) cycleNode = cur;
//             cur = cur.next;
//             i++;
//         }
//         if (i == index) cycleNode = cur;
//         cur.next = cycleNode; 
//     }
//     void PrintWithCycle() {

//         if (head == null) {
//             System.out.println("NULL");
//             return;
//         }
//         Node cycleStart = detectCycle();

//         Node current = head;
//         while (current != cycleStart) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.print("[" + current.data + " -> ");
//         current = current.next;
//         while (current != cycleStart) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("... cycle back to " + cycleStart.data + "]");
//     }

//     Node detectCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) break;
//         }
//         if (fast == null || fast.next == null) return null;
//         slow = head;
//         while (slow != fast) {
//             slow = slow.next;
//             fast = fast.next;
//         }
//         return slow;
//     }
//     void main(){
//         LLleet list = new LLleet();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);
//         list.add(60);
//         list.add(70);

//         list.Print();
      
//         list.createCycle(2); 

//         System.out.println("hasCycle: " + list.hasCycle());

//         Node start = list.detectCycle();
//         System.out.println("Cycle starts at: " + start.data);

//         System.out.print("With cycle:    ");
//         list.PrintWithCycle();
 
//     }
// }

// Cycle detection in the linked list +++++++++++++===================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//  class Node{
//      int data;
//      Node prev;
//      Node next;

//      Node(int data ){
//          this.data = data;
//          this.next = null;
//          this.prev = null;
//      }
//  }

//  public class LLleet {
//      Node head;

//      void Add(int data){
//          Node newNode = new Node(data);
//          if (head == null){
//              head = newNode;
//              return;
//          }
//          Node temp = head;
//          while (temp.next != null){
//             temp = temp.next;
//          }
//          temp.next = newNode;
//      }

//      Node createCycle(int  pos){
//         if(head == null || pos < 0){
//             return head;
//         }
//         Node currnet = head;
//         Node cycleTarget = null;
//         int currentIndex = 0;

//         while (currnet.next != null) {
//             if(currentIndex == pos){
//                 cycleTarget = currnet;
//             }
//             currnet = currnet.next;
//             currentIndex++;
//         }
//         if(cycleTarget != null){
//             currnet.next = cycleTarget;
//             System.out.println("Cycle created! Tail node now points to node with value:" + cycleTarget.data);
//         }
//         else {
//             System.out.println(">> Invalid position. Cycle not created.");
//         }
//         return head;
//      }

//      boolean detectCycle(){
//         if(head == null || head.next == null){
//             return false;
//         }
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
//      }

//      void print(){
//         Node current = head;
//         while(current != null){
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("null");
//      }
//      void printSafe(Node startNode, int limit) {
//         Node current = startNode;
//         int count = 0;
        
//         while (current != null && count < limit) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//             count++;
//         }
//         System.out.println("... (and it keeps looping!)");
//     }

//      void main(){
//         LLleet list = new LLleet();
//         list.Add(10);
//         list.Add(20);
//         list.Add(30);
//         list.Add(40);
//         list.Add(50);
//         list.print();
//         Node cyclic =   list.createCycle(2);
//         System.out.println("Cycle detected? " + list.detectCycle());
//         list.printSafe(cyclic , 12);
//      }
//  }

// REVERSE A LINKED LIST WITH FOUR APPROACH 
//  FIRST :- The Standard Iterative Reversal ====================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LLleet {
//     Node head;

//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//          while (temp.next != null) {
//             temp = temp.next;
//          }
//          temp.next = newNode;
//     }

//     void  reverse(){
//         Node prev = null;
//         Node curr = head;
    
//     while (curr != null) {
//         Node nextTemp = curr.next; 
//         curr.next = prev;              
//         prev = curr;                   
//         curr = nextTemp;               
//     }
//     this.head =  prev;
//     }

//     void Print(){
//         Node currrent = head;
//         while(currrent != null){
//             System.out.print(currrent.data + " -> ");
//             currrent = currrent.next;
//         }
//         System.err.println("Null");
//     }
//     void main(){
//         LLleet list = new LLleet();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);
//         list.add(60);
//         list.Print();
//         list.reverse();
//         list.Print();
//     }
// }
// SECOND 2. The Standard Recursive Reversal
  //  This approach travels all the way to the end of the list using the call stack, 
  // and then reverses the pointers as the recursion "unwinds" and travels back to the beginning. +==============>>>>>>>>>

//   class Node{
//     int data;
//     Node next;
    
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
//   }

//   public class LLleet {
//         Node head;
    
//     void add(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     } 
//     Node reverseRecursion(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         Node newhead = reverseRecursion(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newhead;
//     }
//     void Print(){
//         Node curr = head;
//         while(curr != null){
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }
//         System.out.println("NULL");
//     }
//     void main(){
//         LLleet ll = new LLleet();
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);
//         ll.Print();
//         ll.head = ll.reverseRecursion(ll.head);
//         ll.Print();
//     }
//   } 

// Reversing a Sublist (Reverse Linked List II)

//  This pattern reverses only a portion of the list, 
// from position left to position right. 
// It uses a clever "insertion" method to reverse the sublist in a single pass.===============================+++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
  }

  public class LLleet {
        Node head;
    
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    } 
    Node ReverseSublit(int left, int right) {
        if (head == null || left > right) {
            return head;
        }

        // Create dummy node (data=0 doesn't matter)
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        // Move prev to just before left position
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        Node start = prev.next;  // First node to reverse
        Node then = start.next;  // Next node to process

        // Reverse from left to right
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;    // Remove 'then' from list
            then.next = prev.next;     // Insert 'then' at start of reversed
            prev.next = then;          // Update prev to new reversed start
            then = start.next;         // Move to next node
        }
        return dummy.next;  // New head
    }

    void Print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    void main(){
        LLleet ll = new LLleet();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.Print();
        ll.ReverseSublit(2,4);
        ll.Print();
    }
  } 