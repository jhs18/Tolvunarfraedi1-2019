/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið forritið GagnaPor.java sem fær á skipanalínunni
 * safn para sem lýsa gagnamengi. Fyrra stakið í hverju pari er jákvæð heiltala k og það
 * seinna kommutala x. Þetta merkir að x kemur k sinnum fyrir í gagnasafninu. Til dæmis
 * ef skipanalínan inniheldur 2 3.7 1 8.92 4 2.0, þá eru sjö gildi í gagnamenginu: tvö
 * eintök af 3.7, eitt af 8.92 og fjögur eintök af 2.0. Forritið ykkar á að lesa inn tölurnar og
 * skrifa út ýmsa tölfræði um gildin í gagnamenginu: i) heildarsummuna, ii) heildarfjölda
 * gilda, iii) meðaltalið og iv) stærsta gildið. Þið megið gera ráð fyrir að inntakið sé á réttu
 * formi, þ.e. jafn fjöldi talna, með heiltölur og kommutölur til skiptis.
 *
 *
 *****************************************************************************/

public class GagnaPor {
    public static void main(String[] args) {
        int N = args.length;
        int[] a = new int[N];
        double[] b = new double[N];
        double summa = 0.0;
        double fjoldi = 0.0;
        for (int i = 0, j = 1; i < N && j < N; i = i + 2, j = j + 2) {
            a[i] = Integer.parseInt(args[i]);
            b[i] = Double.parseDouble(args[j]);
            summa = summa + a[i] * b[i];
            fjoldi = fjoldi + a[i];
        }
        System.out.println("Heildarsumma gilda er " + summa);
        System.out.println("Heildarfjöldi gilda er " + (int) fjoldi);
        System.out.println("Meðaltalið er " + summa / fjoldi);

        double max = 0.0;
        double[] hast = new double[N];
        for (int i = 0; i < N; i++) {
            hast[i] = Double.parseDouble(args[i]);
            if (hast[i] > max)
                max = hast[i];
        }
        System.out.println("Stærsta gildið er " + max);
    }
}



