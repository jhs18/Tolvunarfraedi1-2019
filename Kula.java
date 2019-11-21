/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið Java forritið ThrirIRod.java, sem tekur inn þrjú heiltöluviðföng a, b og c,
 *            af skipanalínunni og prentar true ef þau eru í vaxandi röð eða ef þau eru í
 *            minnkandi röð, þ.e. a < b < c eða a > b > c. Forritið prentar út false annars.
 *            Til dæmis kemur eftirfarandi út ef inntakið er 3 9 10
 *            Tölurnar eru:3 9 10 true
 *            Og eftirfarandi ef innntakið er 3 4 3
 *            Tölurnar eru:3 4 3 false
 *
 *
 *****************************************************************************/

public class Kula {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        System.out.print("Flatarmál Kúlu með radíus ");
        System.out.print(radius + " er: ");
        System.out.println(4 * Math.PI * Math.pow(radius, 2));
        System.out.print("Rúmmál Kúlu með radíus ");
        System.out.print(radius + " er: ");
        System.out.println((4 * Math.PI * Math.pow(radius, 3) / 3));
    }
}
