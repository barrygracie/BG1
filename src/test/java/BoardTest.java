import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class BoardTest {

    Board tb;
    Random tr = new Random();


    @Test
    public void testSetupMines(){
        tb = new Board(10,10);
        tb.setupMines(tr);
        Assertions.assertEquals(10,tb.noOfMines, "No of Mines should be 10");
    }


}
