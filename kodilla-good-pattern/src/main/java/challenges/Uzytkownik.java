

package challenges;
        import java.util.ArrayList;
public class Uzytkownik {




    private final String nickName;
    private final String imie;
    private final String nazwisko;
    private ArrayList<Order> historiaZamowien = new ArrayList<>();

    public Uzytkownik(final String nickname, final String firstName, final String lastName) {
        this.nickName = nickname;
        this.imie = firstName;
        this.nazwisko = lastName;
    }

    public String getNickname() {
        return nickName;
    }

    public void addOrderToUserHistory(Order order) {
        historiaZamowien.add(order);
    }
}

