package Ejercicios.Ejercicio_2;
import java.util.*;
public class Ejercicio_2_10 {

    public static void main(String[] args) {
        ArrayList j =new ArrayList<>();
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Introduce unn numero hasta el que crear la lista: ");
        num= sc.nextInt();
        System.out.print(listapares(j, num));
    }
 public static  ArrayList listapares(ArrayList j, int n) {
    if (n==2){
        j.add(n);
    return j;}
    else{
        if (n % 2 == 0){
            j.add(n);
            
            return listapares(j, n-1);
        }else{
            return listapares(j, n-1);
        }
         
    }
        
    }
    
 }
