package Ejercicios.Ejercicio_2;
import java.util.*;
    public class Ejercicio_2_3{
        public static void main(String[] args) {
            int base;
            int exponente;
            Scanner sc = new Scanner(System.in);
            System.out.println("elija unn numero que quiera elevar a una potencia: ");
            base = sc.nextInt();
            Scanner cs = new Scanner(System.in);
            System.out.println("elija una potencia: ");
            exponente = cs.nextInt();
            System.out.println(Potencia(base, exponente));
        }
        public static int Potencia(int base, int exponente){
            if (base == 0 &&exponente == 0){
                return 404;
            }else if (exponente == 0 && base != 0){
                return 1;
            }else{
                return base * Potencia(base, exponente-1);
            }
        }

    }
