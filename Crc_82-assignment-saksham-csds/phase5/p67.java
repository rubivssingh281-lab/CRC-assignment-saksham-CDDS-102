class p67{
    static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        int Fact=n*factorial(n-1);
        return Fact;
    }
    public static void main(String[] args){
        int num = 6;
        int fact = factorial(num);
        System.out.println("Factorial of "+num+"="+fact);
    }
}