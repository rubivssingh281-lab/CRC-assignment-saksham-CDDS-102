class DNode{
    int data;
    DNode prev;
    DNode next;
    DNode(int d){
        data = d;
        prev = null;
        next = null;
    }
}
public class p75{
    DNode head;
    void insert(int value){
        DNode newNode = new DNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        DNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    void delete(int value){
        if(head == null) return;
        DNode temp = head;
        while(temp != null && temp.data != value){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Value not found");
            return;
        }
        if(temp == head){
            head = head.next;
            if(head != null) head.prev = null;
        } 
        else{
            temp.prev.next = temp.next;
            if(temp.next != null) temp.next.prev = temp.prev;
        }
    }
    void displayForward(){
        DNode temp = head;
        System.out.print("Forward: ");
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        p75 dll = new p75();
        dll.insert(5);
        dll.insert(10);
        dll.insert(15);
        dll.displayForward();
        dll.delete(10);
        dll.displayForward();
        dll.delete(5);
        dll.displayForward();
    }
}