import java.util.Scanner;

public class p57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String str2 = str.substring(0);

        System.out.println("Copied string: " + str2);
        sc.close();
    }
}