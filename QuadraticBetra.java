/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið endurbætta útgáfu af forritinu 1.2.3 Quadratic formula
 * QuadraticBetra.java sem prentar út rætur á annars stigs jöfnu
 * 𝑎𝑥
 * 2 + 𝑏𝑥 + 𝑐 = 0
 * ræturnar fyrir stuðlana a, b og c eru rót1 og rót2
 * en prentar út skilaboðin aðgreinir er neikvæður ef aðgreinirinn (e. discriminant) er
 * neikvæður og prentar út a er 0 ef a er 0
 *
 *
 *****************************************************************************/

public class QuadraticBetra {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = (b * b) - (4.0 * a * c);
        double sqroot = Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / (2.0 * a);
        double root2 = (-b - sqroot) / (2.0 * a);
        if (discriminant < 0) {
            System.out.println("Aðgreinir er neikvæður");
        }
        else if (a == 0) {
            System.out.println("a er 0");
        }
        else {
            System.out.print("Ræturnar fyrir stuðlana ");
            System.out.print(a + " " + b + " " + c + " eru ");
            System.out.print(root1 + " og ");
            System.out.print(root2);
        }
    }
}

