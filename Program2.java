import java.util.*;
public class Program2 {
    public static int minimum(int[] nums){
        int min = nums[0];
        int max = nums[0];
        int mi=0, ma=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                ma=i;
            }
            if(nums[i]<min){
                min = nums[i];
                mi=i;
            }
        }
        return mi>ma?mi:ma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(minimum(a));
        sc.close();
    }
}
