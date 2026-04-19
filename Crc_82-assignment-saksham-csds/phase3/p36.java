import java.util.*;
class p36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            sum = sum+a[i];
        }
         int avg = sum / n;  
        System.out.println("sum is of the array is = " + sum);
        System.out.println("average of the array is = " + avg);
    }
}
