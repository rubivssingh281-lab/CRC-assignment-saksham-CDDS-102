import java.util.*;

public class p40{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter position to delete :");
        int pos = sc.nextInt();
        for(int i = pos-1; i < n-1; i++) {
            a[i] = a[i + 1];
        }
        System.out.println("array after deletion:");
        for(int i = 0; i < n - 1; i++) {
            System.out.print(a[i]);
        }
    }
}