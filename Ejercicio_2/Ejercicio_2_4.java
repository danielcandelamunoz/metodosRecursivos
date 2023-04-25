package Ejercicios.Ejercicio_2;

public class Ejercicio_2_4 {
    public static void main(String[] args) {
     int [] n = {1,2,3,4,5,6,7,8,9};
        System.out.println(Ops(n, 0));
    }
    public static int Ops(int [] n, int i ){
        if (i == n.length -1 ){
            return n[1];
        }else{
            return n[i] + Ops(n, i+1);
        }

    }
}
