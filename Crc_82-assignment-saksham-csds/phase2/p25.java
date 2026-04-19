public class strong {
    public static void main(String[] args) {
        int i, t1, rem, sum = 0, co = 0,som=0 ;
        for (i = 1; 1 > 0; i++) {
            t1 = i;
            while (t1 > 0) {
                rem = t1 % 10;
                sum += factorial(rem);
                t1 /= 10;
                som+=rem;
            }
            if (sum == i) {
                System.out.print(i + ",");
                co++;
                System.out.println("Sum of digits: " + som);
            }
            if (co==4){
                break;  
            }
            sum = 0;
            som=0;
        }
    }

    private static int factorial(int rem) {
        int fact = 1;
        for (int i = 1; i <= rem; i++) {
            fact *= i;
        }
        return fact;
    }
}