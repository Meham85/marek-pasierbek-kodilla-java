package challenges.food2door.distributors;

import challenges.food2door.Order;
import challenges.food2door.OrderDTO;

import java.util.Random;

public class HealthyShop implements FoodDistributor {
    private static final String NAME = "Healthy Shop";

    @Override
    public OrderDTO process(Order order) {
        boolean isOrdered = new Random().nextInt(2)>0;

        if (isOrdered) {
            System.out.println("Zamówienie numer " + order.getOrderNumber() + " zostało zrealizowane!");
            return new OrderDTO(true,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        } else {
            System.out.println("Zamówienie " + order.getOrderNumber() + " nie zostało zrealizowane. Skontaktuj się z contact@healthyshop.com\n tel:13454532\n");
            return new OrderDTO(false,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        }
    }

    @Override
    public String getDistributorName() {
        return NAME;
    }
}
