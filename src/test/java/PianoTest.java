import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "black", InstrumentType.keyboard, 800, 1150);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.keyboard, piano.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(800, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(1150, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canPlaySound(){
        assertEquals("plink plonk", piano.play());
    }
}
