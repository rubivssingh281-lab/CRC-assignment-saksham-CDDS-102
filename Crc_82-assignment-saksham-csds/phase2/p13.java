import java.util.Scanner;
public class p13 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("enter the value of a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("enter the value of b");
        b = sc.nextInt();
        System.out.println("enter the value of c");
        c = sc.nextInt();
        if(a>b && a>c)
        { 
            System.out.println("a is the greatest number");  
        }
        else if (b>a &&b>c)
        { 
            System.out.println("b is greatest number");
        }
        else
        {
            System.out.println("c is greatest number");
        }
    }
}
