
        import java.util.Scanner;
        public class p17 {
            public static void main(String[] args) {
                int num1;
                int num2;
                char op;
                
                System.out.println("enter the value of first number");
                Scanner sc = new Scanner(System.in);
                num1 = sc.nextInt();
                System.out.println("enter the value of second number");
                num2 = sc.nextInt();
                System.out.println("enter the operator (+, -, *, /)");
                op = sc.next().charAt(0);
                
                switch(op) {
                    case '+':
                        System.out.println(num1 + num2);
                        break;
                    case '-':
                        System.out.println(num1 - num2);
                        break;
                    case '*':
                        System.out.println(num1 * num2);
                        break;
                    case '/':
                        if(num2 != 0) {
                            System.out.println(num1 / num2);
                        } else {
                            System.out.println("division by zero is not allowed");
                        }
                        break;
                    default:
                        System.out.println("invalid operator");
                }
            }
        }
    
