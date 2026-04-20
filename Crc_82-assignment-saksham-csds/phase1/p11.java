
import java.util.Scanner;

public class p11 {
    public static void main(String[]args)
    {
    int days;
    System.out.println("enter the number of days");
    Scanner sc = new Scanner(System.in);
    days = sc.nextInt();
    int years = days/365;
    int months = days/30;
    int remainingDays = (days%365)%30;
    System.out.println(days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.");
    sc.close();
    }
}
