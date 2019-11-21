/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Nemendaþjónusta var að útskýra fyrir nemanda hvernig misserum er háttað við
 * Háskóla Íslands. Mánuðirnir ágúst, september, október, nóvember og desember
 * teljast til haustmisseris en janúar, febrúar, mars, apríl og maí teljast til vormisseris. Þið
 * eigið að skrifa Java forritið HvadaMisseri.java sem skrifar út Haustmisseri ef
 * mánuðurinn telst til haustmisseris en Vormisseri ef mánuðurinn telst til vormisseris.
 * Ef mánuðurinn er ekki tala á bilinu 1 til 12 þá eru skrifuð villuboð Ekki löglegur
 * mánuður. Sýnið úttak úr forritskeyrslu með þremur mismunandi gildum, eitt fyrir hvert
 * tilvik.
 *
 *
 *****************************************************************************/

public class HvadaMisseri {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if ((x >= 1) && (x <= 5)) {
            System.out.println("Vormisseri");
        }
        else if ((x >= 8) && (x <= 12)) {
            System.out.println("Haustmisseri");
        }
        else if ((x >= 6) && (x <= 7)) {
            System.out.println("Sumarfrí");
        }
        else {
            System.out.println("Ekki löglegur mánuður");
        }
    }
}
