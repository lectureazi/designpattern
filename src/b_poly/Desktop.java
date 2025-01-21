package b_poly;

public class Desktop extends Computer{

    private boolean isAllInOne;

    public Desktop(String brand, String name, int price, String cpu, String ram) {
        super(brand, name, price, cpu, ram);
    }

    public boolean isAllInOne() {
        return isAllInOne;
    }
}
