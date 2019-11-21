/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Skrifið forritið ThrjarMyndir sem tekur inn nafn á myndaskrá (t.d. darwin.jpg) af
 * skipanalínu og býr til og birtir þrjá Picture hluti, einn sem inniheldur aðeins rauða
 * eiginleikann, ein fyrir græna eiginleikann og ein bláa eiginleikann. Þið getið notað
 * hvaða myndaskrá af heimasíðu kennslubókarinnar sem þið viljið í keyrslu forritsins.
 * Sýnið forritskóða og skjáskot af keyrslu forrits.
 *
 *
 *****************************************************************************/

import java.awt.Color;

public class ThrjarMyndir {
    public static void main(String[] args) {
        Picture pic = new Picture(args[0]);
        int width = pic.width();
        int height = pic.height();
        Picture picRed = new Picture(width, height);
        Picture picGreen = new Picture(width, height);
        Picture picBlue = new Picture(width, height);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color color = pic.get(i, j);
                int Red = color.getRed();
                int Green = color.getGreen();
                int Blue = color.getBlue();
                picRed.set(i, j, new Color(Red, 0, 0));
                picGreen.set(i, j, new Color(0, Green, 0));
                picBlue.set(i, j, new Color(0, 0, Blue));
            }
        }
        picRed.show();
        picGreen.show();
        picBlue.show();
    }
}
