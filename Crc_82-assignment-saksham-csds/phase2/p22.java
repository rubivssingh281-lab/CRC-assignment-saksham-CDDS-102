import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n, i, j, flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        System.out.print("Prime numbers are:");

        for (i = 2; i <= n; i++) {
           
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0)
                System.out.print(i + " ");
            flag = 0;
            s.close();
        }
    }
}
