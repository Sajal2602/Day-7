import java.util.*;
public class Program11{
    public static int goodpair(int[] a){
        int c=0;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length;j++)
                if(i<j && (a[i]==a[j]))
                    c++;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(goodpair(a)>0?"Number of good pairs : "+goodpair(a):"There are no good pairs");
        sc.close();
    }
}