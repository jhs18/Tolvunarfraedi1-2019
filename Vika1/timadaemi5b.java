/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class timadaemi5b<a> {
    public static void main(String[] args) {
        int[] a = new int[args.length];
        int N = 5;
        int M = 5;
        boolean t[][] = new boolean[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = (Math.random() < 0.5);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (a) {
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
        }
        System.out.print(a);
    }
}


