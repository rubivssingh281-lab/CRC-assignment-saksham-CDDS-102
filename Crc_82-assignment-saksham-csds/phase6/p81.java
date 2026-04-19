class p81 {
    static int togBit(int num, int n) {
        int mask = 1 << n;
        return (num ^ mask);
    }    
    public static void main(String[] args) {
        int Num = 13;
        System.out.println("Original: "+Num+" (binary 1101)");
        int toggled = togBit(Num, 1);
        System.out.println("After toggling bit 1: "+toggled);
        toggled = togBit(toggled, 1);
        System.out.println("Toggle again: "+toggled);
    }
}