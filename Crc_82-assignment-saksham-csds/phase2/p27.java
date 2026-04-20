import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int n, sum = 0, temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");

        n = s.nextInt();
        temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum: " + sum);
        s.close();
    }
}
