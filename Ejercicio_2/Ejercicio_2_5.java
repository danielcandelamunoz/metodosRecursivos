package Ejercicios.Ejercicio_2;

public class Ejercicio_2_5 {
    public static void main(String[] args) {
        int [] n = {1,2,3,4,5,6,7,8,9};
        System.out.println(Media(n, 0) /n.length);
    }
    public static int Media(int [] n, int i){
        if (i == n.length -1 ){
            return n[1];
        }else{
            return n[i] + Media(n, i+1);
    }
}
}
