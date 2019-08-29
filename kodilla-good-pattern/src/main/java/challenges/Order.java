package challenges;

import java.time.LocalDateTime;

public class Order {


        private Uzytkownik user;
        private Produkt product;
        private LocalDateTime orderTime;

        public Order(final Uzytkownik user, final Produkt product, final LocalDateTime orderTime) {
            this.user = user;
            this.product = product;
            this.orderTime = orderTime;
        }

        public Uzytkownik getUser() {
            return user;
        }

        public Produkt getProduct() {
            return product;
        }

        public LocalDateTime getOrderTime() {
            return orderTime;
        }
    }

