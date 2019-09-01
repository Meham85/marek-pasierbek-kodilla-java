package challenges.food2door;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        OrdersSample ordersList = new OrdersSample();
        ArrayList<Order> orders = ordersList.retrieve();

        for (Order order: orders) {
            OrderDTO orderDTO = order.getFoodDistributor().process(order);
            if (orderDTO.isOrdered()) {
                System.out.println("INFO O ZAMÓWIENIU:"
                        + "\ndata: " + order.getOrderTime().format(DateTimeFormatter.ISO_DATE)
                        + ", godzina: " + order.getOrderTime().format(DateTimeFormatter.ISO_TIME)
                        + "\ntowar: " + order.getProduct().getProductName()
                        + "\nilość: " + order.getQuantity()
                        + "\ndostawca: " + order.getFoodDistributor().getDistributorName() + "\n");
            }
        }
    }
}
