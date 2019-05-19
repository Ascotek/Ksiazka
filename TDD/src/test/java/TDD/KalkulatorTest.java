package TDD;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class KalkulatorTest {
    Kalkulator kal;

    @Before
    public void setUp(){
        kal = new Kalkulator(25, 5,100,36,0.25);
    }

    @Test
    public void firstKalTest(){
        assertThat(kal.dodawanie).as("Wynik dodawania: %s nie jest poprawny", kal.dodawanie).isEqualTo(25);
        assertThat(kal.odejmowanie).as("Wynik odejmowania: %s nie jest poprawny", kal.odejmowanie).isEqualTo(5);
        assertThat(kal.mnożenie).as("Wynik mnożenia: %s nie jest poprawny", kal.mnożenie).isEqualTo(36);
        assertThat(kal.dzielenie).as("Wynik dzielenia: %s nie jest poprawny", kal.dzielenie).isEqualTo(100);
        assertThat(kal.odwracanie).as("Wynik odwracania: %s nie jest poprawny", kal.odwracanie).isEqualTo(0.25);

    }

}