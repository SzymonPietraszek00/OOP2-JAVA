public class lab03
{
    public static void main(String args[])
    {

        Wydzial w = new Wydzial();

        w.dodaj(new Student(27236,"Jan", "Nowak"));
        w.dodaj(new Student(89347,"Ela", "Kowalska"));
        w.dodaj(new Student(9546,"Entomologia", "Motylkowska"));

        w.print();

        
   
        
        


    
    }

}