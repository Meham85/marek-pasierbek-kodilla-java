package challenges;

import java.time.LocalDateTime;

public class OrderServiceCreditCardPaymentDelivery implements OrderService {

        @Override
public boolean createOrder(Uzytkownik user, Produkt product, LocalDateTime orderTime){
    System.out.println("Usługa zamówienie\nprodukt: " + product.getNazwaProduktu() + "\nzamawiający: " + user.getNickname()
            + "\ndata zamowienia: " + orderTime + "\nwybrana metoda płatności: Karta Kredytowa\n");
    return true;
}
}
