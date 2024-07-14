import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
      

        int result = (M * N) / 2;
        System.out.println(result);
        sc.close();
    }
}
