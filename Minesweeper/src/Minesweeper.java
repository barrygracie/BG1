import java.util.*;

public class Minesweeper {
    public static Board b;


    public static void main(String[] args)
    {
        startGame();
    }

    public static int inputBoardSize(){
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\nPlease enter the board size: ");
        return sc.nextInt();

    }

    public static int inputMineNo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\nPlease enter the number of Mines: ");
        return sc.nextInt();


    }

    public static void startGame(){
        System.out.println("\n\n================Welcome to Minesweeper ! ================\n");
        int bs = inputBoardSize();
        int nm = inputMineNo();
        b = new Board(bs,nm);
        b.setupMines();
        b.setMineCounters();
        b.displayBoard();
        b.displayMines();

        boolean flag = true;
        while(flag)
        {
            b.displayBoard();
            flag = b.playMove();
            if(b.checkWin())
            {
                b.displayMines();
                System.out.println("\n================You WON!!!================");
                break;
            }
        }




    }

}