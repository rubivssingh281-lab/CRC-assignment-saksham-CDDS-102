import java.util.Scanner;

public class p58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.lastIndexOf("");

        System.out.println("Length: " + length);
        sc.close();
    }
}