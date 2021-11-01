import java.util.ArrayList;

public class Wydzial{

    private ArrayList<Student> students;


    Wydzial(){
        students = new ArrayList<Student>();
    }

    public void dodaj(Student s){

        boolean temp = false;

        for (Student student : students){
            if(s.getID() == student.getID()){
                temp = true;
            }
        }

        if(!temp){
            students.add(s);
        }else{
            System.out.println("Osoba z takim numerem ID znajduje sie juz na liscie studentow!!");
        }
        
    }

    public void print(){
        
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }


    public String getNameById(int id){

        for (Student student : students){
            if(student.getID() == id){
                return student.getImie() +" "+ student.getNazwisko();
            
            }
        }

        return "Nie ma takiego studenta";

    }

    public int getIdByName(String imie, String nazwisko){

        for (Student student : students){
            if(student.getImie() == imie && student.getNazwisko() == nazwisko){
                return student.getID();
            }
        }

        return 0;

    }
   
   

    
}
