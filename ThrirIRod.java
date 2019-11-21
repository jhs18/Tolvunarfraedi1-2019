/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class ThrirIRod {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a < b && b < c) {
            System.out.println("Tölurnar eru: " + a + " " + b + " " + c + " true");
        }
        else {
            System.out.println("Tölurnar eru: " + a + " " + b + " " + c + " false");
        }
    }
}
