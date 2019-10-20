package products;

public class Piano extends Instrument{

    private int numOfOctaves;


    public Piano(String material, String colour, InstrumentType type, double buyPrice, double sellPrice) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numOfOctaves = 7;
    }

    public String play() {
        return "plink plonk";
    }
}