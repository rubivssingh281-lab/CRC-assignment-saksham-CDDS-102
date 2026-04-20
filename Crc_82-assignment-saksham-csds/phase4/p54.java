import java.util.Scanner;

class p54{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = s.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = s.nextLine();
        System.out.println(str1 + " " + str2);
        s.close();
    }
}