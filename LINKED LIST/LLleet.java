import java.util.HashSet;
import java.util.*;

// Floyd’s Tortoise and Hare Algorithm (Cycle Detection in Linked List) +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

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
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new  Node(data);
    }

    void Print(){
        Node current = head;
        while (current != null) {
        System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.err.println("NULL");
    }

    boolean hasCycle(){
        Node Slow = head;
        Node Fast = head;

        while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next.next;

            if(Slow == Fast){
                return true;
            }
        }

        return false;
    }
        void createCycle(int index) {
        Node tail = head;
        Node cycleNode = null;
        int i = 0;
        Node cur = head;
        while (cur.next != null) {
            if (i == index) cycleNode = cur;
            cur = cur.next;
            i++;
        }
        if (i == index) cycleNode = cur;
        cur.next = cycleNode; 
    }
    void PrintWithCycle() {

        if (head == null) {
            System.out.println("NULL");
            return;
        }
        Node cycleStart = detectCycle();

        Node current = head;
        while (current != cycleStart) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("[" + current.data + " -> ");
        current = current.next;
        while (current != cycleStart) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("... cycle back to " + cycleStart.data + "]");
    }

    Node detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    void main(){
        LLleet list = new LLleet();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list.Print();
      
        list.createCycle(2); 

        System.out.println("hasCycle: " + list.hasCycle());

        Node start = list.detectCycle();
        System.out.println("Cycle starts at: " + start.data);

        System.out.print("With cycle:    ");
        list.PrintWithCycle();
 
    }
}
