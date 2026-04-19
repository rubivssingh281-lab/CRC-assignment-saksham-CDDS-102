import java.util.Scanner;

public class p10 {
        public static void main(String[]args){
        int a;
        float b;
        char c;
        double d;
        System.out.println("enter the value of a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("enter the value of b");
        b = sc.nextFloat();
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("enter the value of c");
        c = sc.next().charAt(0);
        System.out.println("Size of char: " + Character.BYTES + " bytes");
        System.out.println("enter the value of d");
        d = sc.nextDouble();
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        sc.close();
    }
}
