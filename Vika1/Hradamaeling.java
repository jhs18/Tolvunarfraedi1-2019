/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Þið eigið að skrifa Java forritið Hradamaeling.java, sem fær inn heiltölurnar
 * upphafshradi, hamarkshradi og T sem hermir hegðun hraða bíls þar til bíll er
 * tekinn úr umferð. Inntaksgildið upphafshradi er upphafshraði bílsins,
 * hamarkshradi er hraði bílsins þegar hann á að fá sekt. Inntaksbreytan T er fjöldi
 * ítrana sem þið eigið að framkvæma til að nálga útkomuna
 *
 *
 *****************************************************************************/

public class Hradamaeling {
    public static void main(String[] args) {
        int upphafshradi = Integer.parseInt(args[0]);
        int hamarkshradi = Integer.parseInt(args[1]);
        int T = Integer.parseInt(args[2]);
        double min = 0;
        int tap = 0;
        int stop = 0;
        for (int i = 0; i < T; i++) {
            int hradi = upphafshradi;
            while ((hradi >= 0) && (hradi < hamarkshradi)) {
                min++;
                if (Math.random() < 0.5) hradi++;
                else hradi--;
            }
            if (hradi >= hamarkshradi) tap++;
            else stop++;
        }
        System.out.println("Fjoldi sekta " + tap + " af " + T);
        System.out.println("Hlutfall bíla með sekt " + (100.0 * tap / T) + "%");
        System.out.println("Meðalfjöldi mínutna í akstri " + (min / T));
    }
}


