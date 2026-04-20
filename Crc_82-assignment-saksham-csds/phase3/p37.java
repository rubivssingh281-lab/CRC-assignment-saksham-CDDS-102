import java.util.*;

public class p37 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
           System.out.println("enter size of array:");
            int n = sc.nextInt();
            int a[] = new int[n];
             System.out.println("enter elements:");
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int num=a[0];
            int max=num;
            int min=num;
            for(int j=0;j<a.length;j++)
            {
                if (a[j]>num)
                     max= a[j];
                else if (a[j] < num)
                    min= a[j];
            }
                System.out.println("maximum number in the array is = " + max);
                System.out.println("minimum number in the array is = " + min);
    }
    
}
