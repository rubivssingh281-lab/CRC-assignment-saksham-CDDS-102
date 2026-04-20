import java.util.Scanner;
public class p18 {
    public static void main(String[]args)
    {
        char c;
        System.out.println("enter the character");
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        if(c>='A'&& c<='Z'|| c>='a'&& c<='z')
        {
            System.out.println("the character is an alphabet");
        }
        else if (c>='0'&& c<='9')
        {
            System.out.println("the character is a digit");
        }
        else
        {

            System.out.println("the character is a special character");
        }
    sc.close();
    }
}

