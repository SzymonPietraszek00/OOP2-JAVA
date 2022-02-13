public class Student{

    private String imie;
    private String nazwisko;
    private int wiek;


    Student(){

    }


    Student(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }


    public String getImie(){
        return this.imie;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public int getWiek(){
        return this.wiek;
    }

    @Override
    public String toString(){
        return this.imie + " " + this.nazwisko + " " + this.wiek;
    }
}