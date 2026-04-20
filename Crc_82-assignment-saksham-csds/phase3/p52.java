 import java.util.*;

public class  p52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of square matrix:");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + a[i][i];
        }
        System.out.println("sum of diagonal elements = " + sum);
    }
}