package products;

public class Guitar extends Instrument{

    private int numOfStrings;


    public Guitar(String material, String colour, InstrumentType type, double buyPrice, double sellPrice, int numOfStrings) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numOfStrings = 6;
    }

    public String play() {
        return "twang";
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }
}
