import java.util.Scanner;

public class V02Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [][] tictac = new char [3][3];
        for(int i=0;i<3;i++){
            String row = input.nextLine();
            if(row.length() != 3){
                return;
            }
            for(int u=0;u<3;u++){
                char t = row.charAt(u);
                if (t != 'X' && t!= 'O' && t!= '.'){
                    return;
                }
                tictac [i][u] = t;
            }          
        }
        int countX = countMoves(tictac, 'X');
        int countO = countMoves(tictac, 'O');
        
        boolean countsValid = (countX == countO || countX == countO +1);
        if (!countsValid){
            System.out.println("invalid board");
            return;
        }
        boolean Xwon = hasWon(tictac, 'X');
        boolean Owon = hasWon(tictac, 'O');
        if(Xwon&&countX != countO+1){
            System.out.println("invalid");
            return;
        }
        if (Owon&&countO != countX){
            System.out.println("invalid");
            return;
        }
        
        
        char winner = checkWinner(tictac);
        if (winner == 'X' || winner == 'O'){
            System.out.println("the winner is "+winner);
        }
        else{
            System.out.println("no winner");
        }       
    }
           
    public static int countMoves(char[][]tictac, char player){
        int count = 0;
        for(int i=0;i<3;i++){
            for(int u=0;u<3;u++){
                if (tictac [i][u] == player){
                count++;
                } 
            }
        }
        return count;
    }
    public static char checkWinner (char [][] tictac){
        boolean Xwon = hasWon(tictac, 'X');
        boolean Owon = hasWon(tictac, 'O');
        
        if (Xwon && !Owon){
            return 'X';
        }
        if (Owon && !Xwon){
            return 'O';
        }
        else {
            return '.';
        }
    }
    public static boolean hasWon (char [][] tictac, char player){
        for(int i=0;i<3;i++){
            if (tictac[0][i]==player && tictac[1][i]==player && tictac[2][i]==player){
                return true;
            }
            if (tictac[i][0]==player && tictac[i][1]==player && tictac[i][2]==player){
                return true;
            }}
        if (tictac[0][0]==player && tictac[1][1]==player && tictac[2][2]==player){
                return true;
        }
        if (tictac[0][2]==player && tictac[1][1]==player && tictac[2][0]==player){
                return true;
        }                   
        return false;
    }
    
        
    
}
