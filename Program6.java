import java.util.*;
public class Program6 {
    public static int MaxEve(int[] a){
        int m=Integer.MIN_VALUE;
        for(int i:a)
            if(i>m && i%2==0)
                m=i;
        return m;
    }
    public static int MinOdd(int[] a){
        int m=Integer.MAX_VALUE;
        for(int i:a)
            if(i<m && i%2!=0)
                m=i;
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array :");
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println("Output "+(MaxEve(a)-MinOdd(a)));
        sc.close();
    }
}
