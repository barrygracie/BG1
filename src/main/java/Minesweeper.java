import java.util.Scanner;

public class Minesweeper {
    public static Board b;

    public static void main(String[] args) {
        Board gameBoard = runSetup();
        startGame(gameBoard);
    }

    public static int inputBoardSize(){

        Scanner sc= new Scanner(System.in);
        int size = 0;
        while(size<1){
            System.out.println("\nPlease enter the board size: ");
            size = sc.nextInt();
            if(size<1){System.out.println("Invalid board size");}
        }
        return size;

    }

    public static int inputMineNo(int size){
        Scanner sc= new Scanner(System.in);
        int mines = 0;
        while(mines<1 || mines>= (size*10)){
            System.out.println("\nPlease enter the number of Mines: ");
            mines =  sc.nextInt();
            if(mines<1 || mines>= (size*10)){
                System.out.println("Invalid number of mines");
            }
        }
        return mines;
    }

    public static Board runSetup(){
        int bs = inputBoardSize();
        int nm = inputMineNo(bs);
        b = new Board(bs,nm);
        b.setupMines(b.getRandom());
        b.setMineCounters();
        return b;
    }

    public static void startGame(Board b){
        System.out.print("\n\n=========================================================\n");
        System.out.print("MINESWEEPER\n");
        System.out.print("=========================================================\n");

        boolean gameOn = true;
        while(gameOn)
        {
            b.displayBoard();
            gameOn = b.playMove();
            if(b.checkWin())
            {
                b.displayMines();
                System.out.println("\n================You WON!!!================");
                break;
            }
        }
    }

}