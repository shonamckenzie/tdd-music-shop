package instruments;

public class Trumpet extends Instrument{

    private int numOfValves;


    public Trumpet(String material, String colour, InstrumentType type, double buyPrice, double sellPrice) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numOfValves = 3;
    }
}
