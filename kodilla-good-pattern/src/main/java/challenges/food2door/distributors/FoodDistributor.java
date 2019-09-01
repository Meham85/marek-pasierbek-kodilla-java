package challenges.food2door.distributors;

import challenges.food2door.Order;
import challenges.food2door.OrderDTO;


public interface FoodDistributor {

    OrderDTO process(Order order);
    String getDistributorName();

}
