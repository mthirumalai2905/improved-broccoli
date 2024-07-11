import java.util.Scanner;

public class Team{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        sc.nextLine();
        int ProblemsSolved = 0;
       

        while(P != 0){
           int  Petya = sc.nextInt();
           int  Vasya = sc.nextInt();
           int  Tonya = sc.nextInt();

           if(Petya + Vasya + Tonya >= 2){
            ProblemsSolved++;
           }

            P--;
        }
        
        System.out.println(ProblemsSolved);
        sc.close();
    }
}