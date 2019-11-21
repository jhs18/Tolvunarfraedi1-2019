/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class MathTD {
    public static void draw(int n, double x, double y, double size) {
        if (n == 0) return;
        // 2.2 ratio looks good
        double ratio = 2.2;
        // recursively draw 4 smaller trees of order n-1
        draw(n - 1, x - size / 2, y - size / 2, size / ratio);
        draw(n - 1, x - size / 2, y + size / 2, size / ratio);
        draw(n - 1, x + size / 2, y + size / 2, size / ratio);
        draw(x, y, size);
        draw(n - 1, x + size / 2, y - size / 2, size / ratio);
    }
}
