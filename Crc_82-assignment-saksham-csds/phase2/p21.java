import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n, i, flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();

        for (i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                flag = 1;
                break;
            }

        }
        if (flag == 0)
            System.out.print(n + " is a prime number.");
        else
            System.out.print(n + " is not a prime number.");
        s.close();
    }
}
