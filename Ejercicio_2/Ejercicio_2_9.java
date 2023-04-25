package Ejercicios.Ejercicio_2;
import java.util.*;
public class Ejercicio_2_9 {
    public static void main(String[] args) {
        int n [] = {2,4,5,66,7,87,88,32};
        ArrayList j = new ArrayList<>();
        System.out.println(metodo(n, j, n.length-1));
    }
    public static ArrayList metodo(int [] n, ArrayList j, int i){
        if(i==0){
            if (n[0] % 2==0){
                j.add(n[i]);
                return j;
            }else{
                return j;
            }
        }
        else{
            if(n[i] % 2 !=0){
                metodo(n, j, i-1);
            }
            else{
                j.add(n[i]);
                
            }
        }
        return metodo(n, j, i-1);
    }
}
