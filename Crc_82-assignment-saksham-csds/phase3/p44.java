import java.util.*;

public class  p44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements(other than zero):");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter element to search:");
        int k = sc.nextInt();
        int pos = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] == k) {
                pos = i;
                break;
            }
        }
        if(pos == 0)
            System.out.println("element not found");
        else
            System.out.println("element found at index: " + pos);
    }
}