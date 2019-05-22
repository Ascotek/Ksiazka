package TDD;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class KonwerterTest {

    Konwerter konw;

    @Before
    public void setUp(){
        konw = new Konwerter();
    }

    @Test
    @Parameters({"7.2, 2.0", "3.6,1.0","10.8, 3.0"})
    public void poprawnieZamieniaKmHnaMs(double km, double ms){
        assertEquals(2.0, konw.zamienKmhNaMs(7.2), 0.001);
    }

    @Test
    public void poprawnieZamieniaMsNaKmh(){
        assertEquals(7.2, konw.zamienMsNaKmh(2.0), 0.001);
    }
    @Test
    public void poprawnieZamieniaKgNaG(){
        assertEquals(1000, konw.zamieniaKgNaG(1), 0.001);
    }

    @Test
    public void poprawnieZamieniaGNaKg(){
        assertEquals(1, konw.zamieniaGNaKg(1000), 0.001);
    }

    @Test
    @Parameters({"1, 3.28","2.0, 6.56","5, 16.4"})
    public void poprawnieZamienicMNaFeet(double m, double st){
        assertEquals(st, konw.zmieniaMNaFeet(m), 0.001);
    }
   @Test
    public void poprawnieZamienicFeetNaM(){
        assertEquals(1, konw.zmieniaFeetNaM(3.28), 0.001);
    }

    @Test
    @Parameters({"10, 283.15", "20,293.15", "30, 303.15"})
    public void poprawnieZamienicCNaK(double C, double K){
        assertEquals(K, konw.zmienaCNaK(C),0.001);
    }

    public void poprawnieZamienicKNaC(double K, double C){
        assertEquals(C, konw.zmienaKNaC(K),0.001);
    }
    @Parameters({"10, 50", "-10,14", "100,212"})
    public void poprawnieZamienicCNaF(double C, double F){
        assertEquals(F, konw.zmienCNaF(C), 0.001);
    }
    public void poprawnieZamienicFNaC(double F, double C){
        assertEquals(C, konw.zmienFNaC(F), 0.001);
    }
    @Parameters({"300, 88.33", "20,293.15", "10,-441.67"})
    public void poprawnieZamienicKNaF(double K, double F){
        assertEquals(F, konw.zmienKNaF(K), 0.001);
    }
    public void poprawnieZamienicFNaK(double F, double K){
        assertEquals(K, konw.zmienFNaK(F), 0.001);
    }

    @Test
    @Parameters({"1,0.99 ", "2, 1.98", "50,49.5"})
    public void poprawnieZamienicKWnaHP(double KW, double HP){
        assertEquals(HP, konw.zmienKWnaHP(KW), 0.001);
    }

    public void poprawnieZamienicHPnaKW(double HP, double KW){
        assertEquals(KW, konw.zmienHPnaKW(HP), 0.001);
    }






}