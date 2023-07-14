package ex1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ex1 {
    
    public static void main(String[] args){

        List<Integer> par = new ArrayList<Integer>();
        List<Integer> impar = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean y = false;
        int n = 0;
        
        //Checa se o numero inserido é negativo
        while(y == false){
            n = sc.nextInt();
            if(n>0){
                y = true;
            }
        }

        //Adciona os numeros pares e impares as suas respectivas listas
        for(int x = 0; x<n; x++){
            sc.nextLine();
            int numero = sc.nextInt();
            if ( numero%2 == 0){
                par.add(numero);
            }else{
                impar.add(numero);
            }
        }
        
        //Ordena as listas
        Collections.sort(par);
        Collections.sort(impar, Collections.reverseOrder());

        //Adciona tudo em uma lista
        par.addAll(impar);

        //Imprime a lista inteira
        for(Integer x: par){
            System.out.println(x);
        }

        sc.close();
    }  
}
