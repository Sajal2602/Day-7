import java.util.*;
public class Program5 {
    public static int second(int[] a) {
        int m = Integer.MIN_VALUE;
        int n = Integer.MIN_VALUE;
        for(int i:a)
            if(i>m)
                m=i;
        for(int i:a){
            if(i==m)
                continue;
            if(i>n)
                n=i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Second largest element is: " + second(a));
        sc.close();
    }
}
