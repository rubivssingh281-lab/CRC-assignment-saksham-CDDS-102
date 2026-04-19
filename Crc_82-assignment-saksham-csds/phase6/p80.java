public class p80{
    static boolean BitSet(int num, int n){
        int mask = 1<<n;
        int result=num & mask;
        if (result !=0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args){
        int Num = 13;  
        for (int i=0; i<4; i++){
            System.out.println("Bit "+i+" of "+Num+" is set? "+BitSet(Num, i));
        }
    }
}