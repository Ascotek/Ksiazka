package TDD;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BazaUserTest {

    @Mock
    BazaUser buz;                      //Stwórz atrapę dla opracowanej klasy bazy użytkowników

    LinkedList uzytList = mock(LinkedList.class);

    @Test
    public void testMockVerification(){
        User tomek = new User("nick89","Kasia",25, 56, 68, 98768765);
        uzytList.add("Kasia");
        uzytList.add("Basia");
        uzytList.add("Kasia");
        uzytList.add("Jan");
        uzytList.add("Pawel");
        uzytList.add("Janek");
        uzytList.clear();

       // verify(uzytList).add("Kasia");
        verify(uzytList, atLeastOnce()).add("Jan");
        verify(uzytList, atLeast(2)).add("Kasia");

        when(buz.wyszukaj_uzyt(1705)).thenReturn(tomek);
        assertEquals("Kasia",buz.wyszukaj_uzyt(1705));



    }



  /*
    @Mock
    BazaUser buz;

    @Test
    User tomek = new User("Kasia",1.78, 56, 68, 98768765);
    buz.dodaj_uzyt(tomek);
    verify(buz).dodaj_uzyt(any());



*/


}