package ex3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int tamanho = sc.nextInt();
        int valor = sc.nextInt();
        int k = 0;
        int j = 0;

        List<Integer> lista = new ArrayList<Integer>();
        for(int i = 0; i < tamanho; i++)
        {
            sc.nextLine();
            lista.add(sc.nextInt());
        }

        for(int i = 0; i < lista.size()-1; i++) {
            j++;
            if(lista.get(j) - lista.get(i) == valor){
                k++;
            }
        }
        sc.close();
        System.out.println(k);
    }
}
