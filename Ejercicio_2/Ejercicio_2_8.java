package Ejercicios.Ejercicio_2;

public class Ejercicio_2_8 {
    public static void main(String[] args) {
        int [] n = {1,2,3,4,5,6,7,8,9,10};
        System.out.print(array(n, n.length-1));
        }
    public static int array(int []n, int i){
        if (i == 0){
        if (n[i] % 2 == 0){
            return n[i] ;
        }else {
            return 0;
        }
    }
        if (i!=0){
            if(n[i] %2 !=0){
                return array(n, i-1);
            }
        
    }
    return n[i] + array(n, i-1);
    }
}
