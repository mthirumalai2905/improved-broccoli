import java.util.Scanner;

public class GorillaAndPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            int[] permutation = new int[n];
            
            for (int i = 0; i < n - m; i++) {
                permutation[i] = n - i;
            }
            
            for (int i = n - m; i < n; i++) {
                permutation[i] = i - (n - m) + 1;
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(permutation[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
