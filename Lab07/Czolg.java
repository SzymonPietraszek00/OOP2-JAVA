package Armia;

import java.util.ArrayList;

interface CzolgInterface{
    void odbierzRozkaz(Rozkaz rozkaz);
    Identyfikator getIdentyfikator(Identyfikator id);
}

public class Czolg implements CzolgInterface{

    public Czolg(){
        id = new Identyfikator();
    }

    ArrayList<Rozkaz> rozkazy = new ArrayList<>();
    private Identyfikator id;


    public void odbierzRozkaz(Rozkaz rozkaz){
        rozkazy.add(rozkaz);
    }

    public Identyfikator getIdentyfikator(Identyfikator id){
        return this.id;
    }

    public String ostatniRozkaz(){
        
        int temp = (rozkazy.size() - 1);
        return "Ostatni rozkaz do mnie: " + rozkazy.get(temp).getRozkaz();
    }
    
}
