package instruments;

public abstract class Instrument {

    private String material;
    private String colour;
    private InstrumentType type;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String material, String colour, InstrumentType type, double buyPrice, double sellPrice){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double newSellPrice) {
        this.sellPrice = newSellPrice;
    }
}
