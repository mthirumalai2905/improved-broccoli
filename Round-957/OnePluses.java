import java.util.Arrays;
import java.util.Scanner;

public class OnePluses {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       sc.nextLine();

       while(T --> 0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int arr[] = {a,b,c};
        Arrays.sort(arr);

        for(int  i = 0; i < 5; i++){
            if(arr[0] + 1 > arr[1]){
                arr[0]++;
            } else if (arr[1] + 1 > arr[2]){
                arr[1]++;
            } else {
                arr[2]++;
            }
        }
        
        System.out.println(arr[0] * arr[1] * arr[2]);
    }

    sc.close();
    }
}
