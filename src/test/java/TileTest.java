import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {
    Tile testTile;

    @Test
    public void testTileConstructor(){
        testTile = new Tile();
        Assertions.assertEquals(false, testTile.getGuessStatus(), "not initialising tile correctly");
        Assertions.assertEquals(false, testTile.getFlagStatus(), "not initialising tile correctly");
        Assertions.assertEquals(false, testTile.getMineStatus(), "not initialising tile correctly");
    }

    @Test
    public void testSetMine(){
        testTile = new Tile();
        testTile.setMine();
        Assertions.assertEquals(true, testTile.getMineStatus());
    }

    @Test
    public void testSetFlag(){
        testTile = new Tile();
        testTile.setFlag();
        Assertions.assertEquals(true, testTile.getFlagStatus());
    }

    @Test
    public void testSetGuessed(){
        testTile = new Tile();
        testTile.setGuessed();
        Assertions.assertEquals(true, testTile.getGuessStatus());
    }

    @Test
    public void testGetMineCounter(){
        testTile = new Tile();
        int x = testTile.getMineCounter();
        Assertions.assertEquals(0,x,"not returning mine counter correctly");

    }

    @Test
    public void testSetMineCounter(){
        testTile = new Tile();
        testTile.setMineCounter(5);
        Assertions.assertEquals(5,testTile.getMineCounter(),"Not setting mine counter correctly");
    }
}
