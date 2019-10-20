import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import products.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Trumpet trumpet;
    Piano piano;
    Accessory accessory;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("wood", "red", InstrumentType.string, 200, 300, 6);
        trumpet = new Trumpet("brass", "gold", InstrumentType.brass, 400, 650, 3);
        piano = new Piano("wood", "black", InstrumentType.keyboard, 800, 1350, 7);
        accessory = new Accessory("guitar strings", 20, 35);
    }

    @Test
    public void canGetStockCount(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(trumpet);
        shop.addStock(accessory);
        shop.removeStock(piano);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canGetStockItemList(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(trumpet);
        shop.addStock(accessory);

        ArrayList<ISell> expectedStockList = new ArrayList<ISell>();
        expectedStockList.add(guitar);
        expectedStockList.add(piano);
        expectedStockList.add(trumpet);
        expectedStockList.add(accessory);

        assertEquals(expectedStockList, shop.getAllProductInStock());
    }

    @Test
    public void canGetTotalProfit(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(trumpet);
        shop.addStock(accessory);
        assertEquals(600, shop.calculateProfit(), 0.01);
    }
}
