 import java.util.*;

public class  p53 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        System.out.println("enter first matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter second matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int i, j;
        for(i = 0; i < r; i++) {
            for(j = 0; j < c; j++) {
                if(a[i][j] != b[i][j]) {
                    System.out.println("matrices are not equal");
                    return;
                }
            }
        }
        System.out.println("matrices are equal");
    }
}