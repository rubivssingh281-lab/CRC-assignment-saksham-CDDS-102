 import java.util.*;

public class  p51 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of matrix:");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("enter elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(a[i][j] != a[j][i]) {
                    System.out.println("not symmetric matrix");
                    return;
                }
            }
        }
        System.out.println("symmetric matrix");
    }
}