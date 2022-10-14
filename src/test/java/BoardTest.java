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
        boolean test =(tb.getRandom() instanceof Random);
        Assertions.assertEquals(true, test, "not returning a random");

    }

    @Test
    public void testSetMineCounters(){
        tb = new Board(10,10);
        tb.setupMines(tr);
        tb.setMineCounters();
        int counter = 0;

        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if(tb.grid[i][j].isMine){

                }
            }
        }
    }


}
