/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  :  [Gamalt prófdæmi 2018] Skrifið Java fallið int[] fletjaFylki(int[] a),
 * sem fær inn heiltölufylkið a, sem inniheldur heiltölur á bilinu [0, 40], og skilar
 * út öðru fylki með gildi á bilinu [0, 10], þar sem búið er að "fletja út" gildin í a.
 * Þannig að ef a[i] = 23, þá verða til í úttaksfylkinu stökin 10, 10, og 3 (því 23
 * = 10+10+3). Almennt, ef a[i] = c*10 + d, þar sem c og d eru tölustafir, þá
 * koma c eintök af 10 í úttaksfylkið og eitt eintak af d. Til dæmis ef a er {6, 37,
 * 20}, þá skilar fallið fylkinu {6, 10, 10, 10, 7, 10, 10, 0}. Athugið að þið vitið ekki
 * fyrirfram stærð úttaksfylkisins og þurfið að finna hana.
 * Sýnið forritskóða og skjáskot af úttaki úr keyrslu forritsins
 *
 *
 *****************************************************************************/

public class FletjaUt {
    public static void main(String[] args) {
        int N = args.length;
        int[] fylki = new int[N];
        for (int i = 0; i < N; i++) {
            fylki[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int b = fylki[i] / 10;
            while (!(fylki[i] % 10 == 0)) {
                fylki[i]--;
                sum++;
            }
            for (int j = 0; j < b; j++) {
                System.out.print(10 + ", ");
            }
            System.out.print(sum + ", ");
        }
    }
}
