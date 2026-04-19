class p68 {
    static int GCD(int a, int b){
        if (b==0) {
            return a;
        }
        return GCD(b, a%b);
    }
    public static void main(String[] args){
        int x = 56, y = 98;
        int result = GCD(x,y);
        System.out.println("GCD of "+x+" and "+y+" = "+result);
     }
}