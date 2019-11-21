/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class Negative2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if ((a < 0) && (b < 0)) {
            System.out.println("Báðar neikvæðar");
        }
        else if (((a < 0) && (b >= 0)) || ((a >= 0) && (b < 0))) {
            System.out.println("Önnur neikvæð");
        }
        else {
            System.out.println("Hvorugar neikvæðar");
        }
    }
}
