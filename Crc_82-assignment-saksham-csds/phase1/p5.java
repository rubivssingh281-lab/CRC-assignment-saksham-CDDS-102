import java.util.Scanner;
public class p5 {
    public static void main(String[] args) {
        float C;
        float F;
        System.out.println("enter the value in Celcius");
        Scanner sc = new Scanner(System.in);
        C = sc.nextFloat();
        F= (C * 9/5F) + 32;
        System.out.println("the value of F is " + F);
        System.out.println("enter the value in Farenheit");
        F = sc.nextFloat();
        C = 5/9F * (F - 32);
        System.out.println("the value of C is " + C);
        sc.close();
    }
}
