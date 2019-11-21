/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið forrit BaraKronan.java sem kastar krónu þar til útkoman er Krónan (fiskurinn)
 * en ekki Skjaldarmerkið. Notið forritið Math.random() þar sem <0.5 táknar Krónuna
 * (fiskinn) og >=0.5 táknar Skjaldarmerkið. Forritið má samt aldrei fara fleiri en 10
 * umferðir. Skrifið út hve það tekur margar umferðir
 *
 *
 *****************************************************************************/

public class BaraKronan {
    public static void main(String[] args) {
        int tilraunir = 10;
        int kost = 0;
        int fiskur = 0;
        int skjald = 0;
        while ((kost < tilraunir) && (fiskur != 1)) {
            kost++;
            if (Math.random() < 0.5)
                fiskur++;
            else
                skjald++;
        }
        if (fiskur == 1)
            System.out.println("Það tók " + kost + " tilraunir að fá krónuna");
    }
}

