package b_poly;

public class Run {

    public static void main(String[] args) {

        // Object, Product, Computer
        Desktop desktop = new Desktop("삼성", "갤럭시북", 100000, "intel", "32GB");

        // Object, Product, TV
        TV tv = new TV("삼성", "삼성티비", 3000000);

        Client client = new Client();
        Product[] products = new Product[]{desktop, tv};
        for (Product product : products) {
            client.buy(product);
        }
    }
}
