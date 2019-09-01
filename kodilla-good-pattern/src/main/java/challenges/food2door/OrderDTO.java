package challenges.food2door;


import challenges.food2door.distributors.FoodDistributor;

import java.time.LocalDateTime;

public class OrderDTO {
    private boolean isOrdered;
   private Order order;

    public OrderDTO(final boolean isOrdered,
                    final Order order) {
        this.isOrdered = isOrdered;
        this.order = order;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Order getOrder() {
        return order;
    }


}
