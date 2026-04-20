import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter a character: ");

    char ch = sc.nextLine().charAt(0);
    System.out.print("Enter a float: ");
    float f = sc.nextFloat();

        System.out.println("Integer: " + num);
        System.out.println("Character: " + ch);
        System.out.println("Float: " + f);
      
        sc.close();
    }
}

