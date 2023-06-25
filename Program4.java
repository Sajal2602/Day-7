import java.util.*;
class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test case : ");
        int t = sc.nextInt();
        int[] b = new int[t];
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Enter the test case : ");
            b[i] = sc.nextInt();
        }
        for(int i:b){
            int c=0;
            for(int j:a)
                if(i==j)
                    c++;
            System.out.println("Output : "+c);
        }
        sc.close();
    }
}