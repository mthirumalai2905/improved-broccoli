import java.util.Scanner;

public class Love {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        sc.nextLine(); 
        
        while (numberOfTestCases-- > 0) {
            int casseroleLength = sc.nextInt();
            int initialPieces = sc.nextInt();
            int finalPieces = sc.nextInt();
            sc.nextLine(); 
            
            String monkActions = sc.nextLine();
            int currentPieceIndex = initialPieces - 1;
            int wastedPieces = 0;
            int failedOperations = 0;
            
            for (int actionIndex = 0; actionIndex < monkActions.length(); actionIndex++) {
                char action = monkActions.charAt(actionIndex);
                
                if (action == 'L') {
                    currentPieceIndex = initialPieces;
                } else if (action == 'W') {
                    if (currentPieceIndex <= 0) {
                        wastedPieces++;
                    }
                } else {
                    if (currentPieceIndex <= 0) {
                        failedOperations++;
                    }
                }
                currentPieceIndex--;
            }
            
            if (wastedPieces > finalPieces) {
                failedOperations++;
            }
            
            System.out.println(failedOperations != 0 ? "NO" : "YES");
        }
        
        sc.close();
    }
}
