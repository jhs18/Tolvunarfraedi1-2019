/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Á heimasíðu bókarinnar er forritið
 * RecursiveSquares.java sem er lausn á dæmi
 * 22 í kafla 2.3. Þetta forrit teiknar eina af myndunum
 * úr dæminu. Breytið forritinu á tvo vegu: i) Teiknið
 * þríhyrninga í stað ferninga og ii) breytið
 * endurkvæmninni þannig að forritið teikni útgáfuna
 * sem sýnd er hér til hliðar, þ.e. efri hægri og neðri
 * hægri þríhyrningurinn er skrifaður yfir þríhyrning en
 * aðrir undir hann. Skilið forritstextanum og skjámynd
 * af útkomunni.
 *
 *
 *****************************************************************************/
public class RecursionTriangle {
    // plot a square, centered on (x, y) of the given side length
    // with a light gray background and black border
    public static void drawPolygon(double[] x, double[] y, double size) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledPolygon(x, y);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.polygon(x, y);
    }

    // plot an order n recursive squares pattern
    // centered on (x, y) of the given side length
    public static void draw(int n, double[] x, double[] y, double[] size, double[] height) {
        if (n == 0) return;


        // 2.2 ratio looks good
        double ratio = 2.2;
        draw((x - (size / 2), y - height / 2);

    }

    // read in an integer command-line argument n and plot an order n recursive
    // squares pattern
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double x = 0.5, y = 0.5;   // center of square
        double size = 0.5;         // side length of square
        double height = (Math.sqrt((Math.pow(size, 2)) - (Math.pow(size / 2, 2))));
        draw(n, x, y, size);
    }

}
