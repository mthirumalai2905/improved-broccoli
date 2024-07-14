import java.util.Scanner;
import java.util.Arrays;

public class AngryMonk{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] a = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            
            int ans = 0;
            for (int i = 0; i < k - 1; i++) {
                if (a[i] == 1) {
                    ans += 1;
                } else {
                    ans += a[i] * 2 - 1;
                }
            }
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
