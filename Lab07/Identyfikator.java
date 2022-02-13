package Armia;

public class Identyfikator {
    
    public Identyfikator(){
        id++;
        stringId = "" + id;
    }

    static int id = 0;
    public String stringId = "";
}
