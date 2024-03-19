package Haaste_1;

public class Rekisteri {
    public static void main(String[] args){
        Asiakas asiakas_1 = new Asiakas();
        Asiakas asiakas_2 = new Asiakas();
        Asiakas asiakas_3 = new Asiakas();
        Asiakas asiakas_4 = new Asiakas();

        asiakas_4.onTilaaja = false;

        asiakas_1.etunimi = "Jussi";
        asiakas_1.sukunimi = "Smith";
        asiakas_1.age = 32;
        asiakas_1.luokka = 'A';
        asiakas_1.saldo = 9000;

        asiakas_2.etunimi = "Joe";
        asiakas_2.sukunimi = "Park";
        asiakas_2.age = 21;
        asiakas_2.luokka = 'B';
        asiakas_2.saldo = 5000;

        asiakas_3.etunimi = "Jessi";
        asiakas_3.sukunimi = asiakas_1.sukunimi;
        asiakas_3.age = 56;
        asiakas_3.luokka = asiakas_1.luokka;
        asiakas_3.saldo = 4000;

        asiakas_4.etunimi = "Jaakko";
        asiakas_4.sukunimi = "Smith";
        asiakas_4.age = 43;
        asiakas_4.luokka = 'C';
        asiakas_4.saldo = 2500;

        asiakas_1.Printtaaja();
        asiakas_2.Printtaaja();
        asiakas_3.Printtaaja();
        asiakas_4.Printtaaja();
    }
}
/*Tehkää Asiakas classi jolla on seuravat muuttujat
 * - Etunimi
 * - Sukunimi
 * - Ikä
 * - Onko tilaaja kyllä/ei
 * - Asiakas luokka D/C/B/A/S
 * - Saldo
 * 
 * Luokaan Rekisteriin 4 Asiakasta, joilla on kaikilla omat arvonsa
 * - Asiakkaan 1 ja 3 sukunimet ovat samat
 * - Asiakkaan 1 ja 3 luokka on sama
 * - Asiakas 4 ei ole tilaaja
 * 
 * Printtaa consoliin kaikki arvot järjestyjsessä:
 * - Etu ja Sukunimi samalle riville
 * - Ikä
 * - Luokka ja tilaaja samalle riville
 * - Saldo
 */