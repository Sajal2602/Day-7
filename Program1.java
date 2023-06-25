import java.util.*;
public class Program1 {
    public static void swap(int[] a, int s, int e){
        while(s<e){
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array : ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter the number of steps : ");
        int k = sc.nextInt();
        swap(a, 0, n-1);
        swap(a, 0, k-1);
        swap(a,k,n-1);
        System.out.println("Output :");
        for(int i:a)
            System.out.print(i+" ");
        sc.close();
    }
}
