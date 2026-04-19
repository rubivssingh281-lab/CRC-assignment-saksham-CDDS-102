import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        int i, a = 0, b = 1, c = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of terms in series:");
        n = sc.nextInt();
        System.out.print("first " + n + " fabonacci numbers are:");
        for (i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c);
            if (i != n - 1) {
                System.out.print(",");
            }

        }
        sc.close();
    }
}
