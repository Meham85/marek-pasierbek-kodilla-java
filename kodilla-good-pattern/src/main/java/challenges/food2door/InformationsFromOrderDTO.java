package challenges.food2door;

import challenges.food2door.distributors.FoodDistributor;

import java.time.LocalDateTime;

public class InformationsFromOrderDTO  {

        private LocalDateTime orderTime;
        private FoodDistributor foodDistributor;
        private Product product;
        private int quantity;

        public InformationsFromOrderDTO (
                        final LocalDateTime orderTime,
                        final FoodDistributor foodDistributor,
                        final Product product,
                        final int quantity) {

            this.orderTime = orderTime;
            this.foodDistributor = foodDistributor;
            this.product = product;
            this.quantity = quantity;
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
}
