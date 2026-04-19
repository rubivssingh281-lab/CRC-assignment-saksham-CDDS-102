import java.util.Scanner;
public class p15 {
            public static void main(String[] args) {
                char c = 'a';
                System.out.println("enter the character");
                Scanner sc = new Scanner(System.in);
                c = sc.next().charAt(0);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
                   { 
                    System.out.println("the character is a vowel");
                } else {
                    System.out.println("the character is a consonant");
                }
            }
        }
    