import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {
    Tile testTile = new Tile();

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
}
