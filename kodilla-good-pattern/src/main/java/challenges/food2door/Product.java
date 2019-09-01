package challenges.food2door;




public class Product {
    private String productName;
    private String productID;

    public Product(final String productName, final  String productID) {
        this.productName = productName;
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }
}