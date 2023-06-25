import java.util.*;
public class Program3 {
    public static void reverse(char[] s){
        int a=0, e=s.length-1;
        while(a<e){
            char t = s[a];
            s[a] = s[e];
            s[e] = t;
            a++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        char[] c = new char[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            c[i]=sc.next().charAt(0);
        reverse(c);
        for(int i=0;i<n;i++)
            System.out.print(c[i]+" ");
        sc.close();
    }
}
