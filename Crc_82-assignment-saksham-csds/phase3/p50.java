import java.util.*;
public class  p50 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int t[][] = new int[c][r];
        System.out.println("enter matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                t[j][i] = a[i][j];
            }
        }
        System.out.println("transpose matrix:");
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
} 