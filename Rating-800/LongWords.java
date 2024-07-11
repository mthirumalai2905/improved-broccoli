import java.util.Scanner;

public class LongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T != 0){
            String word = sc.nextLine();
            if(word.length() <= 10){
                System.out.println(word);
            }else{
                int length = word.length() - 2;
                String res = word.substring(0, 1) + String.valueOf(length)+ word.substring(word.length()-1);
                System.out.println(res);
            }
            T--;
        }
    }
}
