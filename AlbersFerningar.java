import java.awt.Color;

/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið klasann AlbersFerningar með því að breyta AlbersSquares forritinu
 * þannig að það lesi inn níu tölur, þ.e. 3 tölur í línu þar sem hver lína táknar lit. Teiknið
 * Tölvunarfræði 1 Haust 2019
 * svo sex Albers ferninga sem hafa stóra ferninginn í hverjum lit og litla ferninginn í
 * öðrum lit. Notið fylki og lykkjur sem mest.
 *
 *
 *****************************************************************************/

public class AlbersFerningar {
    public static void main(String[] args) {
        int[][] litir = StdArrayIO.readInt2D();


        // rauður
        int[] r1 = litir[0];
        int[] g1 = litir[1];
        int[] b1 = litir[2];
        Color c1 = new Color(litir[0], litir[1], litir[2]);
        //Blár
        int r2 = Integer.parseInt(litir[3]);
        int g2 = Integer.parseInt(litir[4]);
        int b2 = Integer.parseInt(litir[5]);
        Color c2 = new Color(r2, g2, b2);

        // Græn
        int r3 = Integer.parseInt(args[6]);
        int g3 = Integer.parseInt(args[7]);
        int b3 = Integer.parseInt(args[8]);
        Color c3 = new Color(r3, g3, b3);

        // first Albers square
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.12, 0.5, 0.05);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.12, 0.5, 0.025);

        // second Albers square
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.24, 0.5, 0.05);
        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.24, 0.5, 0.025);

        // third Albers square
        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.36, 0.5, 0.05);
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.36, 0.5, 0.025);

        // fourth Albers square
        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.48, 0.5, 0.05);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.48, 0.5, 0.025);

        // fifth Albers square
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.60, 0.5, 0.05);
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.60, 0.5, 0.025);

        // sixth Albers square
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.72, 0.5, 0.05);
        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.72, 0.5, 0.025);

    }
}
