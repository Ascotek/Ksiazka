package TDD;

public class Konwerter {
    double wspKmNaMs = 3.6;
    double wspFeetM = 3.2808;


    public double zamienKmhNaMs(double kmh){
        return kmh/wspKmNaMs;
    }

    public double zamienMsNaKmh(double ms){
        return ms*wspKmNaMs;
    }

    public double zamieniaKgNaG (double kg){
        return kg*1000;
    }
    public double zamieniaGNaKg (double g){
        return g/1000;
    }

    public double zmieniaMNaFeet(double m){
        return m*wspFeetM;
    }
    public double zmieniaFeetNaM(double feet){
        return feet/wspFeetM;
    }

    public double zmienaCNaK(double C){
        return C+273.15;
    }

    public double zmienaKNaC (double K){
        return K-273.15;
    }

    public double zmienCNaF(double C){
        return C*1.8+32;
    }
    public double zmienFNaC(double F){
        return F-32/1.8;
    }

    public double zmienKNaF(double K){
        return K*1.8-459.67;
    }
    public double zmienFNaK(double F){
        return F+459.67/1.8;
    }

    public double zmienKWnaHP (double KW){
        return KW*0.99;
    }

    public double zmienHPnaKW(double HP){
        return HP/0.99;
    }





}
