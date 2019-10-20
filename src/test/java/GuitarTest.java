import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "red", InstrumentType.string, 200, 350);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.string, guitar.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(200, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(350, guitar.getSellPrice(), 0.01);
    }
}
