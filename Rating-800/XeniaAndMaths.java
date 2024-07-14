import java.util.Arrays;
import java.util.Scanner;

public class XeniaAndMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] numbers = s.split("\\+");
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
           sb.append(numbers[i]);
           if(i < numbers.length - 1){
            sb.append("+");
           }
        }

        System.out.println(sb.toString());
    }
    
}
