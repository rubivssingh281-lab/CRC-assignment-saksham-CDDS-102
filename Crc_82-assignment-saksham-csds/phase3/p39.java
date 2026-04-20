import java.util.*;

public class p39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n + 1];    
        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter element to insert:");
        int ele = sc.nextInt();
        System.out.println("enter position to insert element:");
        int pos = sc.nextInt();
        for(int i = n; i > pos; i--) {
            a[i] = a[i - 1];
        }
        a[pos] = ele;
        System.out.println("array after insertion:");
        for(int i = 0; i < n + 1; i++) {
            System.out.print(a[i]);
        }
    }
}