/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið forritið RunaAfHropmerkt.java sem reiknar út og prentar út jafnóðum 2!, 4!,
 * 6!, 8! …. N sinnum þar sem N er lesið inn af skipanalínu.
 * n hrópmerkt eða n! er reiknað þannig n*(n-1)*(n-2)….3*2*1
 *
 *
 *****************************************************************************/

public class RunaAfHropmerkt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double hropmerkt = 1;
        int reikna = 0;
        int tala = 0;
        while (reikna < N) {
            hropmerkt = hropmerkt * (tala + 1);
            if (tala % 2 != 0) {
                System.out.println(hropmerkt);
                reikna++;
            }
            tala++;
        }
    }
}
