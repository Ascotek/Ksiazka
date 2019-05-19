package TDD;

public class User {
    String name;
    int wiek;
    double wzrost;
    double waga;



    String nick;

    public String getUserName() {
        return nick;
    }

    long numer;

    public User(String nick, String name, int wiek, double wzrost, double waga, long numer) {
        this.name = name;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.numer = numer;
    }
    public long getNumer() {
        return numer;
    }




    public String getName(){
        return name;
    }
    public void zmienNumer(String num){
        if(!num.matches("[0-9]+")){
            throw new IllegalArgumentException("Tekst powinien zawierać jedynie cyfry");
        }

        if (num.length()!=9){
            throw new IllegalArgumentException("Numer powinien mieć 9 cyfr");
        }
        numer = Long.parseLong(num);

    }

    public double getWzrost(){
        return wzrost;
    }

    public double getWiek(){
        return wiek;
    }

    public void zmienWiek(int w){
        if(w<0){
            throw new IllegalArgumentException("Wiek nie moze byc ujemny");
        }
        wiek = w;
    }
}
