package challenges;

public class OrderDto {
    private Uzytkownik user;
    private Produkt product;
    private boolean isBought;

    public OrderDto(final Uzytkownik user, final Produkt product, final boolean isBought) {
        this.user = user;
        this.product = product;
        this.isBought = isBought;
    }



    public Uzytkownik getUzytkownik() {
        return user;
    }

    public Produkt getProduct() {
        return product;
    }

    public boolean isBought() {
        return isBought;
    }
}
