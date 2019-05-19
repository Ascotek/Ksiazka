package TDD;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UserTest2 {

    @Mock
    User us;

    //@InjectMocks             //albo InjectetMock albo Before
    BazaUser buz;

    @Before
    public void setUp(){
        buz = new BazaUser(us);
    }


    @Test
    public void testWywolan(){
        //us = new User("nick4", "Kasia", 45, 1.78, 78, 927364);
        //buz.dodaj_uzyt(us);

        buz.login(0);


        verify(us).getUserName();
    }


}