public class p71{
    static int power(int num, int pow){
        if (pow==0){
            return 1;
        }
        int n = num*power(num, pow-1);
        return n;
    }
    public static void main(String[] args){
        int b=2, e=5;
        System.out.println(b+"^"+e+" = "+power(b, e));
    }
}