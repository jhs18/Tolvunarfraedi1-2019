/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið forritid FlestStok.java sem fær heiltöluna N af skipanalínu. Forritið býr til
 * fylki af stærð N þar sem hvert stak hefur slembitölu á bilinu 20 og 29 (báðar
 * meðtaldar). Forritið prentar út stökin í fylkinu í einni línu með bili á milli og finnur svo
 * hvaða tala kemur oftast fyrir. Skilið forritskóða og skjámynd af keyrslu. Hér að neðan
 * er dæmi um keyrslu:
 *
 *
 *****************************************************************************/

public class FlestStok {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        int temp;
        int tempCount;
        int count = 0;
        int popular = a[0];
        for (int i = 0; i < N; i++) {
            a[i] = (int) (Math.random() * 10 + 20);
            System.out.print(a[i] + " ");
            temp = a[i];
            tempCount = 0;
            for (int j = 0; j < a.length; j++) {
                if (temp == a[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        System.out.println();
        System.out.println("Talan " + popular + " kemur fyrir " + count + " Sinnum");
    }
}


