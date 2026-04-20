class Floydarray{
    public static void main(String[] args){
        int[] next ={1,2,3,4,2};
        System.out.println(hasCycle(next, 0));
    }
    static boolean hasCycle(int[] next, int start){
        if(next==null||next.length==0)
            return false;
        int slow=start,fast=start;
        while(fast!=-1&&next[fast]!=-1){
            slow =next[slow];
            fast =next[next[fast]];
            if(slow==fast)
                 return true;
        }
        return false;
    }
}
