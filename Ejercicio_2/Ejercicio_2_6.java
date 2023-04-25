package Ejercicios.Ejercicio_2;
import java.util.*;
public class Ejercicio_2_6 {
    public static void main(String[] args){

        double [] n = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Math.sqrt(Medianorm(n, 0)*Medianorm(n,0)-Mediacuad(n)));
    }
    public static double cuadrado(double [] n, int i){
        if (i == n.length -1 ){
            return n[1];
        }else{
            return n[i]* n[i] + cuadrado(n, i+1);
        }
    }
    public static double Mediacuad(double [] n){
    return cuadrado(n, 0)/n.length ;
}
    public static double Medianorm(double [] n, int i){
        if (i == n.length -1 ){
            return n[1];
        }else{
        return n[i] + Medianorm(n, i+1);    
    }
    

    
}
}


