package TDD;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;


import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class UserTest {
    User user;
    BazaUser bus;

    @Before
    public void setUp(){
        user = new User("nick4","Kasia", 34, 1.78, 54,583727191);
        /*bus = new BazaUser();
        bus.dodaj_uzyt(new User("Kasia", 25, 1.78, 58, 584889658));
        bus.dodaj_uzyt(new User("Barbara", 29, 1.66, 48, 580989658));
        bus.dodaj_uzyt(new User("Mateusz", 56, 1.79, 78, 798889658));
        bus.dodaj_uzyt(new User("Kamil", 34, 1.89, 67, 124889658));*/

    }

    @Test
    public void firstAssertJTest(){
        assertThat(user.getName()).isEqualTo("Kasia");

       /* assertThat(user.getName()).endsWith("asia")
                .startsWith("K")
                .isEqualToIgnoringCase("kasia");*/

       assertThat(bus.wyszukaj_uzyt(1)).as("Uzytkownika: %s nie ma w bazie",bus.wyszukaj_uzyt(1)).isEqualTo("Kasia");

        /*assertThat(user.getWiek()).as("Uzytkownik: %s ma inny wiek", user.getName()).isEqualTo(89);
        assertThat(user.getWiek()).as("Uzytkownik: %s ma inny wiek", user.getName()).isEqualTo(47);
        assertThat(user.getWiek()).as("Uzytkownik: %s ma inny wiek", user.getName()).isEqualTo(21);
        assertThat(user.getWiek()).as("Uzytkownik: %s ma inny wiek", user.getName()).isEqualTo(0);*/

    }

    @Test
    public void shouldChangeNumber(){
        user.zmienNumer("583727191");
        assertThat(user.getNumer()).isEqualTo(5837271917L);

        assertThatThrownBy(()-> user.zmienNumer("ABC")).hasMessage("Tekst powinien zawierać jedynie cyfry");
        assertThatThrownBy(()-> user.zmienNumer("123")).hasMessage("Numer powinien mieć 9 cyfry");

    }

}