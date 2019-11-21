/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : . Í viku 4 áttuð þið að skrifa forritið cos. Nú eigið þið að skrifa endurkvæma útgáfu af
 * þessu falli og setja í klasann CosProfun. Ef þið notið factorial aðferðina úr
 * bókinni hafið hana í klasanum Factorial og setjið í sömu möppu og CosProfun.
 * Skrifið líka main-fall í CosProfun klasann sem prófar fallið og sýnið skjáskot með
 * einni keyrslu. Sýnið forritskóðann fyrir CosProfun klasann.
 *
 *
 *****************************************************************************/

public class RecursionCos {
    public static double factorial(double n) {
        if (n == 0) return 1;
        else return 2 + n * factorial(n - 1);
    }

    private static double CosProfun(double v) {
        int t = 2;
        if (v == 0) return 1;
        else return v * CosProfun(Math.pow(v, (t + 2)));

    }

    public static void main(String[] args) {
        double X = Double.parseDouble(args[0]);
        double N = Double.parseDouble(args[1]);
        StdOut.println(CosProfun(X) / factorial(N));
    }
}

