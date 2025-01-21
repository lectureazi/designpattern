package a_encapsulation;

public class Coffee {

    private String name;
    private int price;
    private int stock;

    // getter/setter : 읽기 쓰기 수정
    // getter : 읽기
    // x : 접근 불가
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock < 0) throw new IllegalArgumentException();
        this.stock = stock;
    }
}
