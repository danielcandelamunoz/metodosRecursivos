package Ejercicios.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escoge un numero para hacer su factorial: ");
        num = sc.nextInt();
        System.out.println(Fact(num));
    }
    public static int Fact(int n){
        if (n == 1){
            return 1;
        }else if (n == 0){
            return 1;

        }else{
            return n * Fact(n-1);
        } 

    }
}
