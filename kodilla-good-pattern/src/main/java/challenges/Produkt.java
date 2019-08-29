package challenges;

public class Produkt {
    private String nazwaProduktu;
    private String opisProduktu;

    public Produkt(String nazwaProduktu, String opisProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        this.opisProduktu = opisProduktu;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public String getOpisProduktu() {
        return opisProduktu;
    }
}
