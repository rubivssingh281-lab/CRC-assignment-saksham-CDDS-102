import java.util.Scanner;
public class p7 {
    public static void main(String[]args){
        float r;
        float area;
        System.out.println("enter the value of radius");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
        area = 3.14f*r*r;
        System.out.println("the area of circle is " + area);
        sc.close();

    }
}
