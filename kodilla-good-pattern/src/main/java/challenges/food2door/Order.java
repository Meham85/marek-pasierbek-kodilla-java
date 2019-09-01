package challenges.food2door;

import challenges.food2door.distributors.FoodDistributor;

import java.time.LocalDateTime;

public class Order {
    private int orderNumber;
    private LocalDateTime orderTime;
    private FoodDistributor foodDistributor;
    private Product product;
    private int quantity;
    private String productID;

    public Order(final int orderNumber,
                 final LocalDateTime orderTime,
                 final FoodDistributor foodDistributor,
                 final Product product,
                 final int quantity,
            final String productID){
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.foodDistributor = foodDistributor;
        this.product = product;
        this.quantity = quantity;
        this.productID = productID;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public FoodDistributor getFoodDistributor() {
        return foodDistributor;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductID() {
        return productID;
    }
}
