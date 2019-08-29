package challenges;

public class InformationsAboutServiceSMS implements InformationsAboutService{
    public void informUserAboutOrder(Uzytkownik user){
        System.out.println("Informacja o usłudze zamowienia:\nSMS został wysłany do " + user.getNickname() + "\n");
    }
}
