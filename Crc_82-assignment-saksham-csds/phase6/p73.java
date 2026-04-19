class Node{
    int data;
    Node next;   
    Node(int d){
        data = d;
        next = null;
    }
}
class p73{
    Node head;
    void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void delete(int value){
        if(head == null){
            System.out.println("List is empty, cannot delete");
            return;
        }
        if(head.data == value){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Value "+value+" not found");
        }
        else{
            temp.next = temp.next.next;
        }
    }
    void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }
        System.out.print("List: ");
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        p73 list = new p73();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.delete(20);
        list.display();
        list.delete(10);
        list.display();
        list.delete(30);
        list.display();
    }
}