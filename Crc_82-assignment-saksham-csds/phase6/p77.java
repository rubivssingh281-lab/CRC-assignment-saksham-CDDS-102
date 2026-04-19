public class p77{
    int[] arr;
    int front, rear, size, capacity;
    p77(int cap){
        capacity = cap;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    void enqueue(int x){
        if (size == capacity){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear+1)%capacity;
        arr[rear] = x;
        size++;
        System.out.println("Enqueued "+x);
    }
    int dequeue(){
        if (size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        front = (front+1)%capacity;
        size--;
        return val;
    }
    void display(){
        if (size == 0){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int count = 0;
        int idx = front;
        while (count<size){
            System.out.print(arr[idx]+" ");
            idx = (idx+1)%capacity;
            count++;
        }
        System.out.println();
    }
    public static void main(String[] args){
        p77 q = new p77(3);
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.display();
        System.out.println("Dequeued: "+q.dequeue());
        q.display();
        q.enqueue(20);
        q.display();
    }
}