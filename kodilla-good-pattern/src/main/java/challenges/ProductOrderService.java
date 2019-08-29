package challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        Order order = sampleOrder.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new OrderServiceCreditCardPaymentDelivery(), new InformationsAboutServiceSMS(), new OrderRepositoryElectronics());
        OrderDto orderDto = orderProcessor.process(order);

        if (orderDto.isBought()) {
            System.out.println("Podsumowanie: " + orderDto.getProduct().getNazwaProduktu() + "został zamówiony przez "
                    + orderDto.getUzytkownik().getNickname() + ".");
        } else {
            System.out.println("SUMMARY: Zamówienie niekompletne");
        }
    }
}
