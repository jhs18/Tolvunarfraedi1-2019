/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Þið eigið að skrifa forritið Sprengjuleit.java sem tekur inn þrjú gildi á
 * skipanalínu, m, n og p og býr til m sinnum n rökfylki þar sem hvert stak hefur sprengju
 * (true) með líkunum p. Tóm stök (false) eru öruggir staðir. Prentið út fylkið með því að
 * nota stjörnu (*) fyrir sprengju og punkt (.) fyrir örugga staði.
 * Síðan búið til heiltölu tvívítt fylki sem segir til um fjölda sprengja í nágrenninu (fyrir
 * ofan, neðan, til vinstri, hægri og á ská). Skrifið kóðann þannig að það séu eins fá
 * sértilvik eins og hægt er með því að nota (m+2) sinnum (n+2) boolean fylki.
 *
 *
 *****************************************************************************/

public class Sprengjuleit {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int P = Integer.parseInt(args[2]);
        int[][] a = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] += (int) (Math.random() * P);
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] == 1) System.out.print("* ");
                else System.out.print(". ");
            }
        }
    }
}
