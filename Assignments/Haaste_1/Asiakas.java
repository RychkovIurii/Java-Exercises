package Haaste_1;

public class Asiakas {
    String etunimi, sukunimi;
    short age;
    boolean onTilaaja = true;
    char luokka;
    float saldo;

    public void Printtaaja()
    {
        System.out.println("\n");
        System.out.println("Etunimi on " + etunimi + ". Sukunimi on " + sukunimi + ".");
        System.out.println("Ikä on " + age + ".");
        System.out.println("Luokka on " + luokka + ". Onko tilaaja - " + onTilaaja + ".");
        System.out.println("Saldo on " + saldo + ".");
    }
}
