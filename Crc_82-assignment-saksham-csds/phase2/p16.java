import java.util.Scanner;
public class p16 {
    public static void main(String[]args){
    float D;
    float a;
    float b;
    float c;
    System.out.println("enter the value of a");
    Scanner sc = new Scanner(System.in);
    a = sc.nextFloat();
    System.out.println("enter the value of b");
    b = sc.nextFloat();
    System.out.println("enter the value of c");
    c = sc.nextFloat();
    D = (b*b) - (4*a*c);
    if(D>0)
    {
        System.out.println("the roots are real and distinct");
    }
    else if(D==0)
    {
        System.out.println("the roots are real and equal");
    }
    else
    {
        System.out.println("the roots are imaginary");
    }
}
}