/** 
* Klasa lab3string.
* @author Szymon Pietraszek
*/
public class lab3string {

    /**
    * @param s - slowo
    * @return dlugosc slowa
    */
    public static int dlugosc(String s){
        return s.length();
    }


    /**
    * @param s - przeszukiwane slowo
    * @param c - wyszukiwany znak
    * @return ilosc wystapien znaku
    */
    public static int ile_razy_literka_wystepuje(String s, char c){
        
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)== c){ count++; }
        }

        return count;
    }

    /**
    * @param a - pierwsze z porownywanych slow
    * @param b - drugie z porownywanych slow
    * @return zwraca wartosc true/false
    */
    public static boolean czy_takie_same(String a, String b){
        return a.equals(b);
    }

    /**
    * @param s - slowo do odwrocenia
    * @return slowo napisane wspak
    */
    public static String wspak(String s){
        String temp = "";

        for(int i = s.length()-1; i>=0; i--){
            temp += s.charAt(i);
        }


        return temp;
    }

    /**
    * @param a - sprawdzane slowo
    * @return zwraca wartosc true/false - w zaleznosci czy slowo to plaindrom
    */
    public static boolean czy_plaindrom(String s){
        return s.equals(wspak(s));
    }

    /**
    * @param a - sprawdzane slowo
    * @return zwraca wartosc true/false - w zaleznosci czy jest abecadlowe
    */
    public static boolean czy_abecadlowe(String s){

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) > s.charAt(i+1)){ return false; }
        }

        return true;
    }

    /**
    * @param a - kodowane slowo
    * @return zwraca zakodowane
    */
    public static String rot13(String s){

        String temp = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c > 'm' && c<='z'){
                c-=13;
            }else if(c > 'M' && c<='Z'){
                c-=13;
            }else if(c>'A' && c<='M' || c>'a' && c<='m' ){
                c+=13;
            }

            temp += (char)c;
        }
        return temp;
    }
    
}
