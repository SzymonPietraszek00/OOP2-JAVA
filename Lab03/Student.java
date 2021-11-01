public class Student {
    
    private int ID;
    private String Imie;
    private String Nazwisko;
    private static int count = 0;


    Student(int id, String Imie, String Nazwisko){
        this.ID = id;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        count++;
    }


    public String getImie(){
        return Imie;
    }

    public String getNazwisko(){
        return Nazwisko;
    }

    public String toString(){
        return ID + " " + Imie + " " + Nazwisko;
    }

    public static int numberOfStudents(){
        return count;
    }

    public int getID(){
        return ID;
    }


    
}
