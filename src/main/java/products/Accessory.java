package products;

import behaviours.ISell;

public class Accessory implements ISell {

    private String description;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String description, double buyPrice, double sellPrice){
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
