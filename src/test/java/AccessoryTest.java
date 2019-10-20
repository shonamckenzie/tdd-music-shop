import org.junit.Before;
import org.junit.Test;
import products.Accessory;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory guitarStrings;

    @Before
    public void before(){
        guitarStrings = new Accessory("guitar strings", 20, 35);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(15, guitarStrings.calculateMarkup(), 0.01);
    }
}
