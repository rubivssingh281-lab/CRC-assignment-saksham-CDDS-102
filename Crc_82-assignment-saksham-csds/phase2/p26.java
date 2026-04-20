import java.util.*;

public class reverse {
    public static void main(String[] args) {
        int i, t1, rem, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        t1 = sc.nextInt();
        i = t1;
        while (i > 0) {
            rem = i % 10;
            rev = rev * 10 + rem;
            i /= 10;
        }
        System.out.println("Reverse of the number: " + rev);
        sc.close();
    }

}
