import java.util.*;
public class p4 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("values before swapping a=" + a + " b=" + b);
        // without using third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("values after swapping a=" + a + " b=" + b);
        sc.close();

    }
}
