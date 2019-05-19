package TDD;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class BazaUser {


    List<User> baza = new LinkedList<User>();

    public BazaUser(User us){
        baza.add(Objects.requireNonNull(us));
    }

    public void dodaj_uzyt(User user){
        baza.add(Objects.requireNonNull(user));

    }
    public void usun_uzyt(User user){
        baza.remove(user);

    }
    public User wyszukaj_uzyt(int ind){
        return baza.get(ind);
    }
    public void login(int ind){
        String nazwa = baza.get(ind).getUserName();
    }
}
