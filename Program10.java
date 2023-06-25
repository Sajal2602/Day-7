import java.util.*;
public class Program10 {
    public static int goodpair(int[] a, int b){
        int c=0;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length;j++)
                if(i!=j && (a[i]+a[j]==b))
                    c++;
        return c/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter the int : ");
        int b = sc.nextInt();
        System.out.println(goodpair(a, b)>0?"Number of good pairs : "+goodpair(a, b):"There are no good pairs");
        sc.close();
    }
}