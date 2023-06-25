import java.util.Scanner;

public class Program8 {
    public static void reverse(int[] a, int s, int e) {
        while (s < e) {
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }

    public static int[][] output(int[] a, int[] b) {
        int n = a.length;
        int[][] o = new int[b.length][n];
        int[] a1 = a.clone();
        for (int i = 0; i < b.length; i++) {
            reverse(a1, 0, b[i] - 1);
            reverse(a1, b[i], n - 1);
            reverse(a1, 0, n - 1);
            for (int j = 0; j < n; j++) {
                o[i][j] = a1[j];
            }
            a1 = a;
        }
        return o;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the number of rotations: ");
        int r = sc.nextInt();
        int[] b = new int[r];
        System.out.print("Enter the steps: ");
        for (int i = 0; i < r; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Output :");
        for (int[] i : output(a, b)) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
        sc.close();
    }
}
