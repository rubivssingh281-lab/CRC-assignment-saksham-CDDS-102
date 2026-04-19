class p69{
    static void sol(int n, char strt, char end, char aux){
        if (n == 1){
            System.out.println("Move disk 1 strt "+strt+" end "+end);
            return;
        }
        sol(n-1, strt, aux, end);
        System.out.println("Move disk "+n+" strt "+strt+ " end "+end);
        sol(n-1, aux, end, strt);
    }
    public static void main(String[] args) {
        int disks = 3;
        System.out.println("endwer of Hanoi with "+disks+" disks:");
        sol(disks, 'A', 'C', 'B');
    }
}