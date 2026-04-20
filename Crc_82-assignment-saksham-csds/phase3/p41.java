import java.util.*;

public class  p41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(a[i] == a[j]) {
                    
                    for(int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--; 
                    j--; 
    }} }
        System.out.println("array after removing duplicates:");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] );
        }
    }
}