import java.util.*;

public class  p45 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter sorted elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter element to search:");
        int k = sc.nextInt();
        int min = 0, max = n - 1;
        int mid;
        int pos = -1;
        while(min<= max) {
            mid = (min + max) / 2;
            if(a[mid] == k) {
                pos = mid;
                break;
            }
            else if(k > a[mid]) {
            min = mid + 1;
            }
            else {
                max = mid - 1;
            }
        }
        if(pos == -1)
            System.out.println("element not found");
        else
            System.out.println("element found at index: " + pos);
    }
}