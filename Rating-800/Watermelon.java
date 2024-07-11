import java.util.Scanner;

public class Watermelon{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int X = sc.nextInt();
        if(X % 2 == 0 && X > 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}