package products;

public class Trumpet extends Instrument{

    private int numOfValves;


    public Trumpet(String material, String colour, InstrumentType type, double buyPrice, double sellPrice, int numOfValves) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numOfValves = 3;
    }

    public String play() {
        return "buzzz";
    }

    public int getNumOfValves() {
        return numOfValves;
    }
}
