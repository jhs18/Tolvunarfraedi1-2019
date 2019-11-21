/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class CosReikningur {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int N = Integer.parseInt(args[1]);
        double a = 0;
        int tala = 1;
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= i; ++j) {
                tala = tala * j;
            }
            a = (Math.pow(-1, i) * (Math.pow(x, 2 * i) / 2 * tala));
        }
        System.out.println(a);
    }
}
