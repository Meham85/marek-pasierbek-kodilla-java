package challenges.food2door;

import challenges.food2door.distributors.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrdersSample {
    private ArrayList<Order> ordersList = new ArrayList<>();

    public ArrayList<Order> retrieve() {

        FoodDistributor extraFoodShop = new ExtraFoodShop();
        FoodDistributor glutenFreeShop = new GlutenFreeShop();
        FoodDistributor healthyShop = new HealthyShop();

        Product salami = new Product("Salami", "ID012");
        Product miod = new Product("Miód gryczany", "ID014");
        Product mleko = new Product("Mleko", "ID016");

        ordersList.add(new Order(67, LocalDateTime.of(2019,8,1,12,22,34),
                extraFoodShop, salami, 200, "ID012"));
        ordersList.add(new Order(68, LocalDateTime.of(2019,8,11,12,56,11),
                glutenFreeShop, salami, 100, "ID012"));
        ordersList.add(new Order(69, LocalDateTime.of(2019,8,17,12,44,44),
                healthyShop, mleko, 20, "ID016"));
        ordersList.add(new Order(70, LocalDateTime.of(2019,8,25,21,5,11),
                extraFoodShop,mleko, 50, "ID016"));
        ordersList.add(new Order(71, LocalDateTime.of(2019,8,3,14,55,56),
                glutenFreeShop, miod, 40, "ID014"));
        ordersList.add(new Order(72, LocalDateTime.of(2019,8,4,9,2,41),
                healthyShop, salami, 80, "ID012"));
        ordersList.add(new Order( 81, LocalDateTime.of(2019, 8, 31, 23, 34, 23),
                extraFoodShop, salami, 240, "ID012"));

        return new ArrayList<>(ordersList);
    }
}
