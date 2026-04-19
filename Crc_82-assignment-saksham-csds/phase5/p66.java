class p66{
    // call by value
    static void byvalue(int x){
        x = x + 100;
        System.out.println("Inside byvalue, x ="+x);
    }
    // call by reference
    static void byref(int[] arr){
        arr[0] = arr[0] + 100;
        System.out.println("Inside byref, arr[0] ="+arr[0]);
    }

     public static void main(String[] args){
        int a = 10;
        System.out.println("Before byvalue, a ="+a);
        byvalue(a);
        System.out.println("After byvalue, a ="+a);
        int[] arr = {10};
        System.out.println("Before byref, arr[0] ="+arr[0]);
        byref(arr);
        System.out.println("After byref, arr[0] ="+arr[0]);
    }
}