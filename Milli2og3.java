/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Milli2og3 sem tekur inn tvær double tölur af skipanalínu og prentar út
 * true ef þær eru báðar strangt til tekið á milli 2 og 3 (2 og 3 ekki meðtaldar) en annars
 * false. Sýnið inntak og úttaksgildi.
 *
 *
 *****************************************************************************/

public class Milli2og3 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        if ((a > 2) && (a < 3) && (b > 2) && (b < 3)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
