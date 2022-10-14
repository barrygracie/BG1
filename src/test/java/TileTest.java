import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {
    Tile testTile = new Tile();

    @Test
    public void testTileConstructor(){
        testTile = new Tile();
        Assertions.assertEquals(false, testTile.getGuessStatus(), "not initialising tile correctly");
        Assertions.assertEquals(false, testTile.getFlagStatus(), "not initialising tile correctly");
        Assertions.assertEquals(false, testTile.getMineStatus(), "not initialising tile correctly");
    }

    @Test
    public void testSetMine(){
        testTile.setMine();
        Assertions.assertEquals(true, testTile.getMineStatus());
    }

    @Test
    public void testSetFlag(){
        testTile.setFlag();
        Assertions.assertEquals(true, testTile.getFlagStatus());
    }

    @Test
    public void testSetGuessed(){
        testTile.setGuessed();
        Assertions.assertEquals(true, testTile.getGuessStatus());
    }

    @Test
    public void testGetMineCounter(){
        int x = testTile.getMineCounter();
        Assertions.assertEquals(0,x,"not returning mine counter correctly");

    }

    @Test
    public void testSetMineCounter(){
        testTile.setMineCounter(5);
        Assertions.assertEquals(5,testTile.getMineCounter(),"Not setting mine counter correctly");
    }
}
