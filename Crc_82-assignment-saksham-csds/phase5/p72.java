public class p72 {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n+sum(n - 1);
    }
    public static void main(String[] args) {
        int n=10;
        int total=sum(n);
        System.out.println("Sum of first "+n+" natural numbers = "+total);
    }
}