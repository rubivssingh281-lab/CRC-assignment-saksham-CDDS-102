import java.util.*;

public class  p43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter number of rotations:");
        int r = sc.nextInt();
        System.out.println("enter 1 for left rotation, 2 for right rotation:");
        int choice = sc.nextInt();
        r = r % n;    
        if(choice == 1) { 
            for(int i = 0; i < r; i++) {
                int temp = a[0];
                for(int j = 0; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                a[n - 1] = temp;
            }
        }
        else if(choice == 2) {
            for(int i = 0; i < r; i++) {
                int temp = a[n - 1];
                for(int j = n - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                a[0] = temp;
            }
        }

        System.out.println("array after rotation:");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
    }
}