/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Skrifið Java fallið int leggjaSamanHornalinu(int[][] a),sem fær heiltölu
 * tvívítt fylki og leggur saman stökin á hornalínunni. Skrifið einnig main-fall sem les inn
 * tvívítt fylki, kallar svo á fallið ykkar og prentar út niðurstöðuna. Þið getið nýtt ykkur
 * fallið StdArrayIO.readInt2D()til að lesa inn fylkið. Athugið að fallið á að geta
 * ráðið við allar stærðir af tvívíðu fylki af gerðinni NxN
 *
 *
 *****************************************************************************/

public class HornalinuSumma {
    static int leggjaSamanHornalinu(int[][] a) {
        int hornalina = 0;
        for (int i = 0; i < a.length; i++) {
            hornalina += a[i][i];
        }
        return hornalina;
    }

    static public void main(String[] args) {
        int fylki[][] = StdArrayIO.readInt2D();
        System.out.println("Útkoman er: " + leggjaSamanHornalinu(fylki));
    }
}
