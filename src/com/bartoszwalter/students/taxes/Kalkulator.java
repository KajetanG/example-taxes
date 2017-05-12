package com.bartoszwalter.students.taxes;

/**
 * Created by student on 12.05.2017.
 */
public class Kalkulator {

    private double podstawa = 0;
    private char umowa = ' ';
    // składki na ubezpieczenia społeczne
    private double s_emerytalna = 0; // 9,76% podstawyy
    private double s_rentowa = 0; // 1,5% podstawy
    private double u_chorobowe = 0; // 2,45% podstawy
    // składki na ubezpieczenia zdrowotne
    private double kosztyUzyskania = 111.25;
    private double s_zdrow1 = 0; // od podstawy wymiaru 9%
    private double s_zdrow2 = 0; // od podstawy wymiaru 7,75 %
    private double zaliczkaNaPod = 0; // zaliczka na podatek dochodowy 18%
    private double kwotaZmiejsz = 46.33; // kwota zmienjszająca podatek 46,33 PLN
    private double zaliczkaUS = 0;
    private double zaliczkaUS0 = 0;



    public Kalkulator(){

        obliczWszystko();
    }


    private void obliczWszystko(){
        this.obliczPodstawe(podstawa);
        this.obliczPodatek(podstawa);
        this.obliczUbezpieczenia(podstawa);
    }


    private void obliczPodatek(double podstawa) {
        zaliczkaNaPod = (podstawa * 18) / 100;
    }

    private double obliczPodstawe(double podstawa) {
        s_emerytalna = (podstawa * 9.76) / 100;
        s_rentowa = (podstawa * 1.5) / 100;
        u_chorobowe = (podstawa * 2.45) / 100;
        return (podstawa - s_emerytalna - s_rentowa - u_chorobowe);
    }

    private void obliczUbezpieczenia(double podstawa) {
        s_zdrow1 = (podstawa * 9) / 100;
        s_zdrow2 = (podstawa * 7.75) / 100;
    }
}
