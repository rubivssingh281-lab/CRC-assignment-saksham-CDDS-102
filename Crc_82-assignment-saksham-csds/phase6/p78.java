class StackNode{
    int data;
    StackNode next;
    StackNode(int d){
        data = d;
        next = null;
    }
}
public class p78{
    StackNode top;
    void push(int x){
        StackNode newNode = new StackNode(x);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed "+x);
    }
    int pop(){
        if(top == null){
            System.out.println("Stack empty");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }
    void display(){
        if (top == null){
            System.out.println("Stack empty");
            return;
        }
        StackNode temp = top;
        System.out.print("Stack (top to bottom): ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        p78 stack = new p78();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.display();
        System.out.println("Popped: "+stack.pop());
        stack.display();
    }
}