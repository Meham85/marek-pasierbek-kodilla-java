package challenges.food2door.distributors;

import challenges.food2door.Order;
import challenges.food2door.OrderDTO;



import java.util.Random;

public class ExtraFoodShop implements FoodDistributor {
    private static final String NAME = "Extra Food Shop";
    private String DiscountCardNumber = "012345";
    private int Discount = 7;

    @Override
    public OrderDTO process(Order order) {
        boolean isOrdered = new Random().nextInt(2)>0;

        if (isOrdered) {
            System.out.println("Zamówienie numer " + order.getOrderNumber() + " zostało zrealizowane!");
            System.out.println("Twój numer karty rabatowej " + DiscountCardNumber + " przyznany rabat = " + Discount + "%");
            return new OrderDTO(true,
                    order);
        } else {
            System.out.println("Zamówienie " + order.getOrderNumber() + " nie zostało zrealizowane. Skontaktuj się z extra@food.shop\n tel: 03454332\n");
            return new OrderDTO(false,
                    order);
        }
    }

    @Override
    public String getDistributorName() {
        return NAME;
    }
}
