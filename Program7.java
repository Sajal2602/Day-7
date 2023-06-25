import java.util.*;
public class Program7 {
    public static void Output(int[] a){
        int e=0,o=0;
        for(int i:a){
            if(i%2==0)
                e++;
            else
                o++;
        }
        int[] even = new int[e];
        int[] odd = new int[o];
        for(int i:a){
            if(i%2==0){
                even[e-1] = i;
                e--;
            }
            else{
                odd[o-1] = i;
                o--;
            }
        }
        System.out.print("Even : ");
        for(int i:even)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("Odd : ");
        for(int i:odd)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases : ");
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Enter the size of the array : ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter the elements :");
            for(int j=0;j<n;j++)
                a[j]=sc.nextInt();
            Output(a);
            System.out.println();
        }
        sc.close();
    }
}