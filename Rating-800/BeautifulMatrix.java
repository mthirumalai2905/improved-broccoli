import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = 5;
        int N = 5;
        
        int[][] matrix = new int[M][N];

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int row = 0;
        int col = 0;

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(matrix[i][j] == 1) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        int dist = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(dist);
    }
}
