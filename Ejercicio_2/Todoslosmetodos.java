import java.util.*;
public class Todoslosmetodos{

    
    public static int Suma(int n){
        if (n == 1 ){
            return 1;
        }else{
            return n + Suma(n-1);
        }
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
    public static int Potencia(int base, int exponente){
        if (base == 0 &&exponente == 0){
            return 404;
        }else if (exponente == 0 && base != 0){
            return 1;
        }else{
            return base * Potencia(base, exponente-1);
        }
    }
    public static int Ops(int [] n, int i ){
        if (i == n.length -1 ){
            return n[1];
        }else{
            return n[i] + Ops(n, i+1);
        }

    }
    public static int Media(int [] n, int i){
        if (i == n.length -1 ){
            return n[1];
        }else{
            return n[i] + Media(n, i+1);
        }
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
    public static int SumaPares(int n){
        if (n <= 1){
            return 0;} 
            if(n % 2==0){
            return n +SumaPares(n-2); 
         }else{
            return n=n-1;
            }
        
            
        
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
        public static int Pescalar(int [] n, int [] j, int i , int k){
            if (i == n.length && i==j.length){
                return Pescalar(n, j, i, k);
            }else {
                return n[i]*j[i]+Pescalar(n, j, i+1, k);
            }
        }


}