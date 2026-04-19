import java.util.*;

public class  p49 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns of first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter rows and columns of second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if(c1 != r2) {
            System.out.println("multiplication not possible");
            return;
        }
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int mul[][] = new int[r1][c2];
        System.out.println("enter first matrix:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter second matrix:");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                mul[i][j] = 0;
                for(int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("result matrix:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}