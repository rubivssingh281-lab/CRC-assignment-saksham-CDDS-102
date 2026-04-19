import java.util.*;

public class p38 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
           System.out.println("enter size of array:");
            int n = sc.nextInt();
            int a[] = new int[n];
             System.out.println("enter elements:");
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i=a.length-1;i>=0;i--)
            {
                System.out.print(a[i]);
            }
        }
    }
