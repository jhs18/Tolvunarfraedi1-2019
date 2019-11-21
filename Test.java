/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið klasann AlbersFerningar með því að breyta AlbersSquares forritinu
 * þannig að það lesi inn níu tölur, þ.e. 3 tölur í línu þar sem hver lína táknar lit. Teiknið
 * Tölvunarfræði 1 Haust 2019
 * svo sex Albers ferninga sem hafa stóra ferninginn í hverjum lit og litla ferninginn í
 * öðrum lit.
 *****************************************************************************/
public class Test {
    private final long start;

    public Test() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public static void main(String[] args) {
        Stopwatch klukka = new Stopwatch();
        double timi = klukka.elapsedTime();
        StdOut.println(timi);
    }
}


