package ex4;
import java.util.Scanner;


public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quatidade = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<quatidade; i++){
            String frase = sc.nextLine();
            
            //separa a string em duas 
            String string1 = frase.substring(0, (frase.length()/2));
            String string2 = frase.substring(frase.length()/2);

            // inverte as duas strings
            StringBuffer parte1 = new StringBuffer(string1);
            parte1.reverse();
            StringBuffer parte2 = new StringBuffer(string2);
            parte2.reverse();

            System.out.print(parte1);
            System.out.print(parte2);
        }


        sc.close();
    }
}
