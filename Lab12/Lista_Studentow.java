import java.util.ArrayList;
import java.util.*;

public class Lista_Studentow{

    private ArrayList<Student> lista;

    Lista_Studentow(){
        lista = new ArrayList<Student>();
    }

    public void add(Student s){
        lista.add(s);
    }

    public void add(String imie, String nazwisko, int wiek){
        lista.add(new Student(imie, nazwisko, wiek));
    }

    public void wypisz_wszystkich(){
        for(Student student : lista){
            System.out.println(student);
        }
    }


    public void sort_imie_rosnaca(){
        Collections.sort(lista, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getImie().compareTo(s2.getImie());
            }
        });
    }

    public void sort_imie_malejaca(){
        Collections.sort(lista, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getImie().compareTo(s1.getImie());
            }
        });
    }

    public void sort_nazwisko_rosnaca(){
        Collections.sort(lista, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getNazwisko().compareTo(s2.getNazwisko());
            }
        });
    }

    public void sort_nazwisko_malejaca(){
        Collections.sort(lista, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getNazwisko().compareTo(s1.getNazwisko());
            }
        });
    }

    public void sort_wiek_rosnaca(){
        Collections.sort(lista, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getWiek() - s2.getWiek();
            }
        });
    }

    public void sort_wiek_malejaca(){
        Collections.sort(lista, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getWiek() - s1.getWiek();
            }
        });
    }
    
}