class Dutchflag{
    public static void main(String[] args){
        int[] arr ={2,0,2,1,1,0};
        sortCol(arr);
        for(int v:arr)
             System.out.print(v+" ");
    }
    static void sortCol(int[] a){
        int L=0, M=0, H =a.length-1;
        while(M<=H){
            if(a[M]==0) 
                swap(a, L++, M++);
            else if(a[M]==1)
                 M++;
            else 
                swap(a, M, H--);
        }
    }
    static void swap(int[] a, int i, int j) {
        int t = a[i];
         a[i] = a[j]; 
         a[j] = t;
    }
}