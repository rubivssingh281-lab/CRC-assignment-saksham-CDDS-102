class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class p74{
    static Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;  
            current.next = prev;  
            prev = current;       
            current = next;         
        }
        return prev;
    }
    static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.print("Original: ");
        printList(head);
        head = reverseList(head);
        System.out.print("Reversed: ");
        printList(head);
    }
}