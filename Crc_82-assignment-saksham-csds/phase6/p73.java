class elementpos{
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int t = 8;
        int[] res = search(nums, t);
        System.out.println("["+res[0]+","+res[1]+"]");
    }
    static int[] search(int[] a, int t){
        int l = 0, r =a.length-1;
        int f =-1, ls =-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(a[m]>=t)
                 r =m-1;
            else 
                l =m+1;
            if (a[m]==t) 
                f = m;
        }
        l = 0; r=a.length-1;
        while(l<=r){
            int m =l+(r-l)/2;
            if (a[m]<=t)
                 l = m+1;
            else 
                 r = m-1;
            if(a[m]==t) 
                 ls =m;
        }
        System.out.println(new int[]{f, ls});
        return new int[]{f, ls};
    }
}