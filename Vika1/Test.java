/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/


// Java program to get the sum of the series

/******************************************************************************
 *  Nafn    : Nafn höfundar
 *  T-póstur: Tölvupóstur höfundar
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class Test {
    public static int factorial(int n) {
        public static int factorial ( int n){
            if (n == 0) return 1;
            else return n * factorial(n - 1);
        }
        public static void main (String[]args){
            int N = Integer.parseInt(args[0]);
            StdOut.println(factorial(N));
        }
    }
}

