import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
       float P;
       float R;
       float T;
       float SI;
       float CI;
       System.out.println("enter the value of P R and T");
         Scanner sc = new Scanner(System.in); 
         P = sc.nextFloat();
        R = sc.nextFloat();
        T = sc.nextFloat();
        SI= (P * R * T) / 100;
        CI= P * (float) Math.pow((1 + R / 100), T) - P;
        System.out.println("the value of SI is " + SI);
        System.out.println("the value of CI is " + CI);
        sc.close();
    }
}
