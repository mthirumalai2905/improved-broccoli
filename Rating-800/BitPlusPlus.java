import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int I = sc.nextInt();
        sc.nextLine();
        int X = 0;

        while(I != 0){
          String statement = sc.nextLine();
          if(statement.contains("++")){
            X++;
          }else{
            X--;
          }
            I--;
        }

        System.out.println(X);
        sc.close();
    }
}
