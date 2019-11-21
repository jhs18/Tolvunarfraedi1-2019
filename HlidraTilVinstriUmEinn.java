/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class HlidraTilVinstriUmEinn {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String a = args[i];
            args[i] = args[args.length - i];
            args[args.length - i] = a;
            System.out.print(a);
        }
    }
}

