import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class BoardTest {

    Board tb;
    Random tr = new Random();

    @Test
    public void testBoardConstructor(){
        tb = new Board(10,10);
        int counter =0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if(!tb.grid[i][j].isMine && !tb.grid[i][j].isFlag && !tb.grid[i][j].isGuessed){
                    counter++;
                }
            }
        }
        Assertions.assertEquals(10,tb.noOfMines, "No of Mines should be 10");
        Assertions.assertEquals(10,tb.boardSize, "BoardSize should be 10");
        Assertions.assertEquals(100, counter, "tiles not properly initialised");

    }

    @Test
    public void testSetupMines(){
        tb = new Board(10,10);
        tb.setupMines(tr);
        int counter = 0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if(tb.grid[i][j].isMine){
                    counter++;
                }
            }
        }
        Assertions.assertEquals(10,counter, "No of Mines should be 10");

    }

    @Test
    public void testgetRandom(){
        tb = new Board(10,10);
        boolean test =(tb.getRandom() != null);
        Assertions.assertTrue(test, "not returning a random");

    }


    @Test
    public void testUpdateBoard(){
        tb = new Board(10,10);
        tb.updateBoard(5,5);
        boolean g = tb.grid[5][5].getGuessStatus();
        Assertions.assertTrue(g, "Guess not being set");
    }

    @Test
    public void testSetMineCounters(){
        tb = new Board(4,4);
        tb.setupMines(tr);
        tb.setMineCounters();

        int totalNeighbourCount = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int count = 0;
                if (!tb.grid[i][j].isMine) {
                    if (i != 0) {
                        if (tb.grid[i - 1][j].isMine) count++;
                        if (j != 0) {
                            if (tb.grid[i - 1][j - 1].isMine) count++;
                        }
                    }
                    if (i != (3)) {
                        if (tb.grid[i + 1][j].isMine) count++;
                        if (j != 3) {
                            if (tb.grid[i + 1][j + 1].isMine) count++;
                        }
                    }
                    if (j != 0) {
                        if (tb.grid[i][j - 1].isMine) count++;
                        if (i != 3) {
                            if (tb.grid[i + 1][j - 1].isMine) count++;
                        }
                    }
                    if (j != (3)) {
                        if (tb.grid[i][j + 1].isMine) count++;
                        if (i != 0) {
                            if (tb.grid[i - 1][j + 1].isMine) count++;
                        }
                    }
                    totalNeighbourCount = totalNeighbourCount + count;
                }
            }
        }

        int totalNeighbourCount2 = 0;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                totalNeighbourCount2 = totalNeighbourCount2 + tb.grid[i][j].getMineCounter();

                }
            }
        Assertions.assertEquals(totalNeighbourCount2,totalNeighbourCount,"not matching");

        }

    @Test
    public void testDisplayBoard(){
        tb = new Board(10,10);
        tb.displayBoard();
    }

    @Test
    public void testDisplayMines(){
        tb = new Board(10,10);
        tb.displayMines();
    }



}
