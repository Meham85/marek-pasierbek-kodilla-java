package challenges;

import java.time.LocalDateTime;

public interface OrderService {
    boolean createOrder(Uzytkownik user, Produkt product, LocalDateTime orderTime);
}