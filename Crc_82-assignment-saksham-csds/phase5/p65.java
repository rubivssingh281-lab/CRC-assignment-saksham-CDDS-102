class p65{
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;   
        }
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) {
                return false;  
            }
        }
        return true;
    }
    // An Armstrong number
    static boolean isArmstrong(int num){
        int original=num, sum=0, temp=0, digits=0, pow=0;
        while (temp != 0){
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp != 0){
            pow = 1;
            for (int i = 0; i < digits; i++) {
                pow = pow * (temp % 10);
            }
            sum = sum + pow;
            temp = temp / 10;
        }
        return (sum == original);
    }
    // Perfect number
    static boolean isPerfect(int n) {
        if (n <= 1)
             return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++){
            if (n % i == 0){
                sum = sum + i;
            }
        }
        return (sum==n);
    }
    public static void main(String[] args){
        int NUM = 28;
        System.out.println("Number:"+NUM);
        System.out.println("Prime"+isPrime(NUM));
        System.out.println("Armstrong"+isArmstrong(NUM));
        System.out.println("Perfect"+isPerfect(NUM));
    }
}