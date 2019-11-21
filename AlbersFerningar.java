import java.awt.Color;

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
public class AlbersFerningar {
    public static void main(String[] args) {
        int[][] arr = StdArrayIO.readInt2D();
        //Litir
        Color c1 = new Color(arr[0][0], arr[0][1], arr[0][2]);
        Color c2 = new Color(arr[1][0], arr[1][1], arr[1][2]);
        Color c3 = new Color(arr[2][0], arr[2][1], arr[2][2]);
        //Staðsetning
        double a = 0.12;
        // Stærð, stór er 1 og lítill er 2
        double s1 = 0.05;
        double s2 = 0.025;
        //Hæð
        double h = 0.5;
        StdDraw.setCanvasSize(500, 500);
        //Stórir kassar
        for (double i = a; i < a * 3; i += a) {
            StdDraw.setPenColor(c1);
            StdDraw.filledSquare(i, h, s1);
            StdDraw.setPenColor(c2);
        }
        for (double i = a * 3; i < a * 5; i += a) {
            StdDraw.setPenColor(c2);
            StdDraw.filledSquare(i, h, s1);
        }
        for (double i = a * 5; i < a * 7; i += a) {
            StdDraw.setPenColor(c3);
            StdDraw.filledSquare(i, h, s1);
        }
        //Litlir kassar
        for (double i = a * 2; i < a * 4; i += a) {
            StdDraw.setPenColor(c3);
            StdDraw.filledSquare(i, h, s2);
            StdDraw.setPenColor(c2);
        }
        for (double i = a * 4; i < a * 6; i += a) {
            StdDraw.setPenColor(c1);
            StdDraw.filledSquare(i, h, s2);
        }
        for (double i = a; i < a * 7; i += a * 5) {
            StdDraw.setPenColor(c2);
            StdDraw.filledSquare(i, h, s2);
        }
    }
}

