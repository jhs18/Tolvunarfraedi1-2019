/******************************************************************************
 *  Nafn    : Jónas Helgi Sverrisson
 *  T-póstur: jhs18@hi.is
 *
 *  Lýsing  : Ef gefinn er strengur sem inniheldur lén nafn skrifið forritsbút sem ákveður yfir lénið. Til
 * dæmis er yfirlén hi.is is og yfirlén cs.princeton.edu er edu. Sýnið forritskóða og
 * keyrslu með báðum þessum dæmum þar sem lénið er lesið af skipanalínu.
 *
 *
 *****************************************************************************/

public class StringCutter {
    static public void main(String[] args) {
        String[] s = args[0].split("[.]");
        System.out.print(s[s.length - 1]);
    }
}
