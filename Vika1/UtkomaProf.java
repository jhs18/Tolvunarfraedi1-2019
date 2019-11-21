/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  :Skrifið forritið UtkomaProf.java sem tekur inn 8 tölur af skipanalínu þar sem hver
 * tala er á bilinu 0-10. Tölurnar eru útkoma nemanda á 8 prófspurningum.
 * Gefið er fylkið {0.05, 0.10, 0.05, 0.15, 0.05, 0.30, 0.20, 0.10} sem gefur til kynna vægi á
 * prófspurningum. Forritið á að reikna útkomuna úr prófinu.Gætið þess að nota nefnda
 * fasta þar sem það á við.
 *
 *
 *****************************************************************************/

public class UtkomaProf {
    public static void main(String[] args) {
        double[] vaegi = { 0.05, 0.10, 0.05, 0.15, 0.05, 0.30, 0.20, 0.10 };
        int N = args.length;
        int[] utkoma = new int[N];
        for (int i = 0; i < N; i++) {
            utkoma[i] = Integer.parseInt(args[i]);
        }
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum = sum + utkoma[i] * vaegi[i];
        }
        System.out.print("Útkoman á prófinu er " + sum);
    }
}

