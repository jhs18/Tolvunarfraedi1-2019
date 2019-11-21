/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Þegar við búum til þríhyrning með kössum þá hefur efsta röðin einn kassa, næsta röð
 * hefur tvo kassa, o.s.frv. Skrifið endurkvæma Java fallið thriKassar(int n) sem
 * skilar heildarfjölda kassa í svona þríhyrningi með n röðum. Skrifið líka main-fall sem
 * fær heiltölu á skipanalínunni og kallar á fallið með henni. Sýnið skjámynd af einni
 * keyrslu (ath.: það þarf ekkert að teikna í þessu forriti, bara skila gildi).
 *
 *
 *****************************************************************************/

public class KassaPyramidi {
    public static int thriKassar(int n) {
        if (n == 1)
            return 1;
        else
            return n + thriKassar(n - 1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println("Hæð: " + n);
        StdOut.println("Fjoldi kassa: " + thriKassar(n));
    }
}

