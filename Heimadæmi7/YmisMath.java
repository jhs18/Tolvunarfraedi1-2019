package Heimadæmi7;

/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class YmisMath {

    // return the square root of c, computed using Newton's method
    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double EPS = 1E-15;
        double t = c;
        while (Math.abs(t - c / t) > EPS * t)
            t = (c / t + t) / 2.0;
        return t;
    }

    public static void main(String[] args) {

        // parse command-line parameters
        double[] a = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Double.parseDouble(args[i]);
        }

        // compute square root for each command line parameter
        for (int i = 0; i < a.length; i++) {
            double x = sqrt(a[i]);
            System.out.print(x);
        }
    }
}
