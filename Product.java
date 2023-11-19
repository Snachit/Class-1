public class Product {
    public String productName;
    public double price;
    public int quantite;

    public Product(String productName, double price, int quantite) {
        this.productName = productName;
        this.price = price;
        this.quantite = quantite;
    }

    public void afficherinfo() {
        System.out.println("Product name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantite: " + quantite);
    }
}


