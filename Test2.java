/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class Test2 {
    public static void main(String[] args) {
        int N = 19;
        int x = 0;
        while (x < N / 2) {
            x *= 3;
            x++;
        }
        System.out.print(x);
    }
}
