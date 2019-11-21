/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið forritið LangiOrmur.java sem tekur inn töluna lengdOrms af skipanalínu (e.
 * argument) og prentar út eftirfarandi línu sem samanstendur af jafnmörgum strikum og
 * talan segir til um.
 *
 *
 *****************************************************************************/

public class LangiOrmur {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i < N; ++i) {
            for (int j = 1; j < i; ++j) {
                System.out.print("*");
            }
            System.out.print(i);
        }
    }
}

