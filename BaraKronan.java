/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/


public class BaraKronan {
    public static void main(String[] args) {
        int tilraunir = 10;
        int kost = 0;
        int fiskur = 0;
        int skjald = 0;
        while ((kost <= tilraunir) && (fiskur != 1)) {
            kost++;
            if (Math.random() < 0.5)
                fiskur++;
            else
                skjald++;
        }
        if (fiskur == 1)
            System.out.println("Það tók " + kost + " tilraunir að fá krónuna");
    }
}


