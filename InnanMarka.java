/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class InnanMarka {
    public static void main(String[] args) {
        double nedri = Double.parseDouble(args[0]);
        double efri = Double.parseDouble(args[1]);

        while (!StdIn.isEmpty()) {
            double tala = StdIn.readDouble();
            if (tala >= nedri && tala <= efri) {
                StdOut.printf("4.1f ", tala);
            }
        }
    }
}
