package products;

public class Piano extends Instrument{

    private int numOfOctaves;


    public Piano(String material, String colour, InstrumentType type, double buyPrice, double sellPrice, int numOfOctaves) {
        super(material, colour, type, buyPrice, sellPrice);
        this.numOfOctaves = 7;
    }

    public String play() {
        return "plink plonk";
    }

    public int getNumOfOctaves() {
        return numOfOctaves;
    }
}
