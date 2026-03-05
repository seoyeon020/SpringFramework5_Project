package mylab.order.di.xml;

public class Product {
    private String id;
    private String name;
    private double price;

    // 기본 생성자 (Setter 주입을 위해 필요)
    public Product() {}

    // 모든 필드를 포함한 생성자 (Constructor 주입을 위해 필요)
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}