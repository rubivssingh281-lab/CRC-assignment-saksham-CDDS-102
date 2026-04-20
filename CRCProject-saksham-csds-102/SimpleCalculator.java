import java.util.Scanner;
class SimpleCalci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        while(true){
            System.out.println("\nChoose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square root (sqrt)");
            System.out.println("6. Power (^)");
            System.out.println("7. Sine (sin)");
            System.out.println("8. Cosine (cos)");
            System.out.println("9. Tangent (tan)");
            System.out.println("10. Logarithm (log)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if(choice == 0){
                System.out.println("bye!");
                break;
            }
            double num1, num2, result;
            switch(choice){
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1+num2;
                    System.out.println("Result: "+result);
                    break;  
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1-num2;
                    System.out.println("Result: "+result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1*num2;
                    System.out.println("Result: "+result);
                    break;
                case 4:
                    System.out.print("Enter numerator: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter denominator: ");
                    num2 = sc.nextDouble();
                    if(num2 == 0){
                        System.out.println("Cannot divide by zero.");
                    }
                    else{
                        result = num1/num2;
                        System.out.println("Result: "+result);
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    if(num1 < 0){
                        System.out.println("Cannot perform square root of negative number.");
                    } 
                    else{
                        result = Math.sqrt(num1);
                        System.out.println("Result: "+result);
                    }
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result: "+result);
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = Math.sin(Math.toRadians(num1));
                    System.out.println("Result: "+result);
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = Math.cos(Math.toRadians(num1));
                    System.out.println("Result: "+result);
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    num1 = sc.nextDouble();
                    result = Math.tan(Math.toRadians(num1));
                    System.out.println("Result: "+result);
                    break;
                case 10:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    if(num1 <= 0){
                        System.out.println("Logarithm not defined for negative numbers.");
                    } 
                    else{
                        System.out.println("Natural log (ln): "+Math.log(num1));
                        System.out.println("Log base 10: "+Math.log10(num1));
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
