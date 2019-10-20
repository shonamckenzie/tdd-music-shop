package instruments;

public class Guitar extends Instrument{

    private int numOfStrings;


    public Guitar(String material, String colour, InstrumentType type, double buyPrice, double sellPrice) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numOfStrings = 6;
    }

    public String play() {
        return "twang";
    }
}
