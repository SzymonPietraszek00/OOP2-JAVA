//tego pliku nie wolno zmieniać!!!
public class Main
{
 public static void main(String args[])
 {
  //Rnd(N,k) 
  //N - ilość liczb
  //k - każda (z tych 'N') jest sumą 'k' liczb losowych z przedziału <0;1.0)
  Rnd x=new Rnd(10,100);
  x.Print();
  System.out.println("minimum = "+x.Min());
  System.out.println("maksimum = "+x.Max());
  System.out.println("avg = "+x.Average());
  
 }
}

//przykładowy output:
/*
//to na konsolę:

[0]=48.14034335920629
[1]=53.393884065827194
[2]=50.55816777740573
[3]=48.69663276378624
[4]=46.43642301752973
[5]=46.554062661861295
[6]=49.896279096003305
[7]=54.636094015670004
[8]=50.680714506155326
[9]=45.989156584911534
minimum = 45.989156584911534
maksimum = 54.636094015670004
avg = 49.49817578483566


*/