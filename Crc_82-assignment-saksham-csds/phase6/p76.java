class p76{
    int[] arr;
    int cap, top;
    p76(int size){
        cap = size;
        arr = new int[cap];
        top = -1;
    }
    void push(int x){
        if (top == cap-1){
            System.out.println("Stack overflow! Cannot push "+x);
            return;
        }
        top++;
        arr[top] = x;
        System.out.println("Pushed "+x);
    }
    int pop(){
        if(top == -1){
            System.out.println("Stack underflow!");
            return -1;
        }
        int popped = arr[top];
        top--;
        return popped;
    }
    void display(){
        if(top == -1){
            System.out.println("Stack empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        p76 stack = new p76(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println("Popped: "+stack.pop());
        stack.display();
    }
}