import products.InstrumentType;
import products.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("brass", "gold", InstrumentType.brass, 500, 650);
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.brass, trumpet.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(500, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(650, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void canChangeSellPrice(){
        trumpet.setSellPrice(700);
        assertEquals(700, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void canPlaySound(){
        assertEquals("buzzz", trumpet.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(150, trumpet.calculateMarkup(), 0.01);
    }
}
