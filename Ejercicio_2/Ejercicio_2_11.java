package Ejercicios.Ejercicio_2;

public class Ejercicio_2_11 {
    public static void main(String[] args) {
        int [] n ={1,2,3};
        int [] j ={4,5,6};
        System.out.print(Pescalar(n, j, 0, 0));
    }
    public static int Pescalar(int [] n, int [] j, int i , int k){
        if (i == n.length && i==j.length){
            return Pescalar(n, j, i, k);
        }else {
            return n[i]*j[i]+Pescalar(n, j, i+1, k);
        }
    }
    
}
