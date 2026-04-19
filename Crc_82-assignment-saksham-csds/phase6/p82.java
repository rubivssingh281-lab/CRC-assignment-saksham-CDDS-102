class p82{
    static int countBitsSimple(int n){
        int count = 0,temp = 0;
        temp = n;
        while(temp != 0){
            if ((temp & 1)==1)
                count++;
            temp = (temp>>1);
        }
        return count;
    }
    public static void main(String[] args){
        int num = 45;
        System.out.println("Number: "+num);
        System.out.println("Set bits: "+countBitsSimple(num));
    }
}