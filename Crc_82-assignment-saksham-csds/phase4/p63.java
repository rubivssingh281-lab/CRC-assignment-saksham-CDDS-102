import java.util.Scanner;
class p63 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = s.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = s.nextLine();
        s.close();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not equal");
            return;
        }
        boolean isEqual = true;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
