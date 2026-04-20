import java.util.Scanner;
public class p12 {
    public static void main(String[] args) {
        int chr;
        System.out.println("enter the ASCII value");
        Scanner sc = new Scanner(System.in);
        chr = sc.nextInt();
        System.out.println("the character for ASCII value " + chr + " is " + (char)chr);
        sc.close();
    }
}
