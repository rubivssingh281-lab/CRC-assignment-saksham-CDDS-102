import java.util.Scanner;

public class p62 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string to get reversed: ");
        String str = s.nextLine();
        s.close();
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println("Reversed string: " + reversed);
    }
}