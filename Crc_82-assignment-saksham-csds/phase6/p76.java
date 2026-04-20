class Missnum{
    public static void main(String[] args){
        int[] arr = {3,0,1};
        System.out.println(missing(arr));
    }
    static int missing(int[] a){
        int n =a.length;
        int total =n*(n+1)/2;
        int sum =0;
        for(int v : a) 
            sum =sum+v;
        return (total-sum);
    }
}
