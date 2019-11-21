/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class TD3Verkefni1 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        if ((a >= 0) && (a <= 10)) {
            System.out.println("Innan marka");
        }
        else {
            System.out.println("Utan marka");
        }
    }
}
