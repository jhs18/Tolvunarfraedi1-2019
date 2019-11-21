/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class RunarAfHropmerkt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int tala = 1;
        for (int i = 1; i <= N; i++) {
            tala = (tala * i);
        }
        System.out.println(tala);
    }
}
