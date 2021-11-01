import java.util.Random;


public class Rnd{

    private double[] temp;
    private int N;
    private double k;


    public Rnd(int N, double k){
        Random rnd = new Random();
        this.N = N;
        this.k = k;
        temp = new double[N];

        for(int i = 0; i < N; i++){

            for(int j = 0; j < k; j++){
                temp[i] += rnd.nextDouble();
            } 
        }

    }

    public void Print(){

        for(int i = 0; i < N; i++){
            System.out.println("[" + i + "]= " + temp[i]);
        }
    }

    public double Min(){

        double min = 100;

        for(int i = 0; i < N; i++){
            if(min > temp[i]){
                min = temp[i];
            }
        }
        return min;
    }

    public double Max(){
        double max = 0;

        for(int i = 0; i < N; i++){
            if(max < temp[i]){
                max = temp[i];
            }
        }
        return max;
    }

    public double Average(){

        double avg = 0;

        for(int i = 0; i < N; i++){
            avg += temp[i];
        }

        avg = avg/N;

        return avg;
    }


}