/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið forritið HlidraTilVinstriUmEinn.java sem les inn eitt eða fleiri heiltölugildi
 * af skipanalínu og setur í heiltölufylki. Forritið hliðrar gildunum um einn til vinstri þannig
 * að i + fyrsta stakið fer í i-ta stakið og fyrsta stakið fari í síðasta stakið. Prentið svo út
 * fylkið.
 *
 *
 *****************************************************************************/

public class HlidarTilVinstriUmEinn {
    public static void main(String[] args) {
        for (int i = 1; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.print(args[0]);
    }
}


