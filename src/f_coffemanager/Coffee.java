package f_coffemanager;

public class Coffee {

    private String name;
    private int price;
    private int purchasePrice;
    private int stock;
    private int safetyStock;
    private int salesCnt;

    public Coffee(String name, int price, int purchasePrice, int stock, int safetyStock, int salesCnt) {
        this.name = name;
        this.price = price;
        this.purchasePrice = purchasePrice;
        this.stock = stock;
        this.safetyStock = safetyStock;
        this.salesCnt = salesCnt;
    }

    public void setSalesCnt(int salesCnt) {
        this.salesCnt = salesCnt;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getStock() {
        return stock;
    }

    public int getSafetyStock() {
        return safetyStock;
    }

    public int getSalesCnt() {
        return salesCnt;
    }
}
