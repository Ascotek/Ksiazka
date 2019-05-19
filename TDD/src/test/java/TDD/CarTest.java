package TDD;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    LinkedList mockedList = mock(LinkedList.class);

    @Test
    public void testMockVerification(){
        mockedList.add("jeden");
        mockedList.add("dwa");
        mockedList.add("dwa");
        mockedList.add("trzy");
        mockedList.add("trzy");
        mockedList.clear();

        verify(mockedList).add("jeden");
       // verify(mockedList).add("dwa");
        verify(mockedList).clear();
        verify(mockedList, never()).add("abs");

        verify(mockedList, atLeastOnce()).add("jeden");
        verify(mockedList, atLeast(2)).add("trzy");

        verify(mockedList, atLeast(7)).add(anyString());

    }

    @Test
    public void testStub(){
        when(mockedList.get(1)).thenReturn("dom");
       // when(mockedList.get(2)).thenThrow(new Exception("Nastapil wyjatek"));

        System.out.println(mockedList.get(1));

       // System.out.println(mockedList.get(2));


    }
}