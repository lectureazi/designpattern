package b_poly;

public class Computer extends Product{

    protected String cpu;
    protected String ram;

    public Computer(String brand, String name, int price, String cpu, String ram) {
        super(brand, name, price);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
