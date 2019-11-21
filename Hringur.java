/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class Hringur {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        System.out.println(2 * (Math.PI) * radius);
        System.out.println((Math.PI) * radius * radius);
    }
}
