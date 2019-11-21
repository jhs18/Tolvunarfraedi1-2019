/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class Fjarfesta {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        double v = Double.parseDouble(args[1]);
        double K = Double.parseDouble(args[2]);
        System.out.print("Eftir " + t + " áttu " + (K * Math.pow(Math.E, ((v / 100) * t))));
        System.out.println(" kr ef vextirnir eru " + (v) + "% og þú átt núna " + K + " kr.");
    }
}
