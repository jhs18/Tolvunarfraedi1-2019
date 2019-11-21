/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið Java forritið ErRunnud.java, sem fær á skipanalínunni double töluna tala.
 * Ef tala er rúnnuð tala prentið þá út, t.d. fyrir 3.0
 * 3.0 er rúnnuð en annars fyrir t.d. 3.6 3.6 er ekki rúnnuð
 *
 *
 *****************************************************************************/

public class ErRunnud {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.print(i);
        }
    }
}
