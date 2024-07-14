import java.util.Arrays;

public class none {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1};
        int count1 = 0;
        int count0 = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            if(arr[i]== 1){
                count1++;
            }
        }

        for(int i = 0; i < count0; i++){
             arr[i] = 0;
        }

        
        for(int i = count0; i < arr.length; i++){
            arr[i] = 1;
       }
        

       System.out.println(Arrays.toString(arr));

       String str = "Salman";
       System.out.println(str.substring(0,3));

       String str1 = "Hello, World!";
       System.out.println(str1.lastIndexOf("World"));

       int[][] arrr = {{1,2}, {2,3}};

       System.out.println(Arrays.deepToString(arrr));
    }
}
