class Traprain{
    public static void main(String[] args){
        int[] arr ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    static int trap(int[] arr){
        int l=0, r=arr.length-1;
        int lmax=0, rmax=0, water=0;
        while(l<r){
            if(arr[l]<arr[r]){
                if(arr[l]>=lmax)
                     lmax = arr[l];
                else
                     water =water+(lmax-arr[l]);
                l++;
            } 
            else{
                if(arr[r]>=rmax)
                     rmax = arr[r];
                else 
                    water+=(rmax-arr[r]);
                r--;
            }
        }
        return water;
    }
}