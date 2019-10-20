import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public int getStockCount(){
        return stock.size();
    }

    public void addStock(ISell item){
        stock.add(item);
    }

    public void removeStock(ISell item){
        stock.remove(item);
    }

    public double calculateProfit(){
        int totalProfit = 0;
        for(ISell item : this.stock){
            double profit = item.getBuyPrice() * item.calculateMarkup();
            totalProfit += profit;
        }return totalProfit;
    }

    public ArrayList<ISell> getAllProductInStock(){
        ArrayList<ISell> foundAllStockItems = new ArrayList<ISell>();
        for(ISell item : this.stock) {
            foundAllStockItems.add(item);
        }return foundAllStockItems;
    }
}
