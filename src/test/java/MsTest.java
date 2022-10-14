
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MsTest {

    Minesweeper testMs = new Minesweeper();

    @Test
    public void testSetupGameBoard(){
        Board tb = testMs.setupGameBoard(10,10);
        int mines = tb.boardSize;
        int size = tb.noOfMines;

        int counter = 0;
        int mcCheck = 0;
        boolean check = false;

        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                mcCheck = mcCheck + tb.grid[i][j].getMineCounter();
                if(tb.grid[i][j].isMine){
                    counter++;
                }
            }
        }
        if(mcCheck>0){
            check=true;
        }
        Assertions.assertEquals(10,mines,"not setting mines");
        Assertions.assertEquals(10,size,"not setting boardsize");
        Assertions.assertEquals(10,counter,"not setting mines up correctly");
        Assertions.assertEquals(true,check,"not setting any mine counters");
    }


}
