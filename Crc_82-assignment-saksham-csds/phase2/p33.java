import java.util.Scanner;

public class pascals_triangle {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // spaces print karna (left side)
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            int number = 1;

            // numbers print karna
            for (int k = 0; k <= i; k++) {
                System.out.print(number + "   ");
                number = number * (i - k) / (k + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}
