import java.util.Scanner;

public class p59 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();

        System.out.println("want to convert to lower or upper case? (L/U): ");
        String c = s.nextLine();
        c = c.toUpperCase();
        if (c.equals("L")) {
            String lower = str.toLowerCase();
            System.out.println("Lowercase: " + lower);
        } else if (c.equals("U")) {
            String upper = str.toUpperCase();
            System.out.println("Uppercase: " + upper);
        } else {
            System.out.println("Invalid choice. Please enter 'L' for lowercase or 'U' for uppercase.");
        }
        s.close();
    }
}
