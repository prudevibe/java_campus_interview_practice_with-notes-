import java.util.*;

public class tictoctoe{

    public static void main(String[] args){

        TicTokToe t = new TicTokToe();
        Scanner s = new Scanner(System.in);
        int x=0,y=0;
        do{
            System.out.println(t.player == t.X?"Player X turn":"Player 0 turn");
            System.out.println("Enter x and y places");
            x = s.nextInt();
            y = s.nextInt();
            t.putSign(x, y);
            System.out.println(t.toString());
            System.out.println("___________________________");
            t.displayWinner();
        }while(t.isEmpty);

    }
}