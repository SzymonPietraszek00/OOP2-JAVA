package Armia;


import java.util.ArrayList;


interface CentrumDowodzeniaInterface{
    void zarejestrujCzolg(Czolg czolg);
    void wydajRozkaz(String id, Rozkaz rozkaz);
}

public class CentrumDowodzenia implements CentrumDowodzeniaInterface{

    ArrayList<Czolg> czolgi = new ArrayList<>();


    public void zarejestrujCzolg(Czolg czolg){

        czolgi.add(czolg);
    }

    public void wydajRozkaz(String id, Rozkaz rozkaz){
        czolgi.get(Integer.parseInt(id) - 1).odbierzRozkaz(rozkaz);;
    }

    @Override
    public String toString(){
        String s = "Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy:\n";

        for (int i = 0; i < czolgi.size(); i++) {
            s += "Czolg nr " + (i+1) +" otrzymal rozkazy:\n";
            Czolg czolg = czolgi.get(i);
            for(int j = 0; j < czolg.rozkazy.size(); j++){
                s += czolg.rozkazy.get(j).getRozkaz() + "\n";
            }
            s += "\n";
        
        }

        return s;
    }
}
