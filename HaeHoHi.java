/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið Java forritið HaeHoHi sem prentar út heiltölurnar frá 1 til 200, 12 tölur í línu,
 * með kommu á milli hverrar tölu. En í stað þeirra talna sem 3 gengur uppí þá prentast
 * "Hæ", ef 5 gengur uppí töluna þá prentast "Hó" og ef 7 gengur uppí töluna þá
 * prentast út "Hí". Ef bæði 3 og 5 ganga uppí töluna þá prentast út "HæHó", ef 3 og 7
 * ganga uppí hana þá kemur "HæHí", o.s.frv. Ef allar þrjár tölurnar ganga uppí töluna
 * þá kemur "HæHóHí". Hér fyrir neðan eru tvær fyrstu línurnar í úttakinu eins og það á
 * að vera:
 *  1, 2, Hæ, 4, Hó, Hæ, Hí, 8, Hæ, Hó, 11, Hæ
 *  13, Hí, HæHó, 16, 17, Hæ, 19, Hó, HæHí, 22, 23, Hæ
 *  Sýnið forritskóða og skjáskot af úttaki úr keyrslu forritsins.
 *
 *
 *****************************************************************************/

public class HaeHoHi {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 13 == 0) {
                System.out.print("\n");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("HæHóHí, ");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HæHó, ");
            }
            else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("HæHí, ");
            }
            else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("HóHí, ");
            }
            else if (i % 3 == 0) {
                System.out.print("Hæ, ");
            }
            else if (i % 5 == 0) {
                System.out.print("Hó, ");
            }
            else if (i % 7 == 0) {
                System.out.print("Hí, ");
            }
            else {
                System.out.print(i + ", ");
            }
        }
    }
}
