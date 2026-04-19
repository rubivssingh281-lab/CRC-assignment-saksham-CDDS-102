import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("values before swapping a=" + a + " b=" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("values after swapping a=" + a + " b=" + b);
        sc.close();

    }
}
