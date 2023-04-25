package Ejercicios.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_7 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escoge un numero: ");
        num = sc.nextInt();
        System.out.println(+SumaPares(num));
    }
    public static int SumaPares(int n){
        if (n <= 1){
            return 0;} 
            if(n % 2==0){
            return n +SumaPares(n-2); 
         }else{
            return n=n-1;
            }
        
            
        
    }
}
