import java.util.Scanner;
public class p9 {
    public static void main(String[] args) {
        int a;
        System.out.println("enter the value of a");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
if((a&1)==0)
    {
      System.out.println("a is even");
    }
    else {
      System.out.println("a is odd");
    }
}
}
