package challenges;


import java.util.ArrayList;

public class OrderRepositoryElectronics implements OrderRepository {
    private static ArrayList<Order> orderRepository = new ArrayList<>();

    @Override
    public void addOrderToRepository(Order order) {
        orderRepository.add(order);
        System.out.println("REPOSITORY SERVICE:\nzamowienie zostalo dodane do kategori zamowien elektronicznych\n");
    }
}