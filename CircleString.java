/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Strengur s er hringhliðraður af streng t ef þeir eru eins ef stafir annars eru hliðraðir í hring
 * um einhvern fjölda sæta. T.d. ACTGACG is hægri hliðraður af TGACGAC og öfugt. Skrifið
 * fallið isCircularShift() sem athugar hvort tveir strengir s og t eru hringhliðraðir af
 * hver öðrum.
 *
 *
 *****************************************************************************/

public class CircleString {
    static boolean isCircularShift(String a, String b) {

        return (a.length() == b.length()) &&
                ((a + a).indexOf(b) != -1);
    }

    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        if (isCircularShift(a, b))
            System.out.println("Hringhliðruð " + a + " og " + b + " true");
        else
            System.out.println("Hringhliðruð " + a + " og " + b + " false");
    }
}
