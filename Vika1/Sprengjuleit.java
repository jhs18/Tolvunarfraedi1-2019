/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class Sprengjuleit {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] hadamard = new boolean[n][n];

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (hadamard[i][j]) System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }

}

