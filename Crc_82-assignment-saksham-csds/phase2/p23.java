import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        int i, t1, rem, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        t1 = sc.nextInt();
        i = t1;
        while (i > 0) {
            rem = i % 10;
            rev = rev * 10 + rem;
            i /= 10;
        }
        if (rev == t1)
            System.out.print(t1 + " is palindrome.");
        else
            System.out.print(t1 + " is not palindrome.");

        sc.close();
    }

}