/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Notið eftirfarandi formúlu til að reikna cos x þar sem x eru radianar og er lesið inn af
 * skipanalínu sem kommutala. Hæsta tala n er einnig lesin inn.
 *
 *
 *****************************************************************************/

public class CosReikningur {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int N = Integer.parseInt(args[1]);
        double utkoma = 1;
        int formerki = -1;
        int hropmerkt = 1;
        for (int i = 2; i < N; i = i + 2) {
            for (int j = i - 1; j < i + 1; j++) {
                hropmerkt = hropmerkt * (hropmerkt * j);
            }
            utkoma = Math.pow(x, (2 * i)) / hropmerkt;
            utkoma = utkoma * formerki;
            formerki = -formerki;
        }
        System.out.println(utkoma);
        //Afsakið, reyndi mjög mikið en náði aldrei að láta þetta ganga upp.
    }
}
