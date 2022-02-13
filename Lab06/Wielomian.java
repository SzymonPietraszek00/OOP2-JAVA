/** 
* Klasa Wielomian.
* @author Szymon Pietraszek
*/
public class Wielomian{

    protected double a = 0.0;
    protected double b = 0.0;
    protected double c = 0.0;

    Wielomian(double a){
        this.a = a;
    }

    Wielomian(double a, double b){
        this(a);
        this.b = b;
    }

    Wielomian(double a, double b, double c){
        this(a, b);
        this.c = c;
    }

    @Override
    public String toString() {

        String str = "f(x)= ";

        if(this.a != 0){
            str += this.a + "x^2";
        }
        if(this.b != 0){
            str += " + " + this.b + "x";
        }
        if(this.c != 0){
            str += " + " + this.c;
        }
        
        return str;
    }

   
    public void setABC(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
    * @param x - parametr dla ktorego liczona jest wartosc wielomianu
    * @return wartosc wielomianu
    */
    public double getAtX(double x){ 
        return a * x * x + b * x + c;
    }

    /**
    * @param x1 - wartosc od ktorej rozpoczyna sie przedzial calki
    * @param x2 - wartosc na ktorej konczy sie przedzial calki
    * @return wartosc calki
    */
    public double integral(double x1, double x2){ 
        return ( (a/3) * (x2*x2*x2) + (b/2) * (x2*x2) + c * x2) - ( (a/3) * (x1*x1*x1) + (b/2) * (x1*x1) + c * x1);
    }

}


