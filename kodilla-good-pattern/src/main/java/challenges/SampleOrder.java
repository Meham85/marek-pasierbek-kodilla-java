package challenges;

import java.time.LocalDateTime;


public class SampleOrder {

    public Order retrieve() {

        Uzytkownik sampleUser = new Uzytkownik("marek85", "Marek", "Pasierbek");
        Produkt sampleProduct = new Produkt("Amiga 4000 Tower", "Amiga 4000, procesot 1260/60mhz, 16mb FAST Ram");
        LocalDateTime sampleOrderTime = LocalDateTime.of(2019, 8, 26, 12, 34, 25);

        return new Order(sampleUser, sampleProduct, sampleOrderTime);

    }

}
