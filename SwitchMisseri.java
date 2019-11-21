/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið Java forritið SwitchMisseri.java, sem leysir dæmi 4 hér að ofan
 * með því að nota switch-setningu til að ákvarða misserið. Þið megið ennþá nota ifsetningu í
 * villuathuguninni, en verðið að nota switch-setningu til að finna misserið út
 * frá mánuðinum. Sýnið úttak úr forritskeyrslu með tveimur mismunandi gildum, fyrir
 * haustmisseri og fyrir vormisseri.
 *
 *
 *****************************************************************************/

public class SwitchMisseri {
    public static void main(String[] args) {
        int manudur = Integer.parseInt(args[0]);
        switch (manudur) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Vormisseri");
                break;
            case 6:
            case 7:
                System.out.println("Sumarfrí");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Haustmisseri");
                break;
        }
        if ((manudur >= 13) || (manudur <= 0)) {
            System.out.println("Ekki löglegur mánuður");
        }
    }
}
