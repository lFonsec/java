package ex2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Recebe o valor em string e separa no . entre notas e moedas e então converte para int
        String linha = sc.nextLine();
        String[] dinheiro = new String[2];
        dinheiro = linha.split("\\.");
        int notas = Integer.parseInt(dinheiro[0]);
        int moedas = Integer.parseInt(dinheiro[1]);
       
        int restoNotas, restoMoedas = 0;

        //Calcula o maior valor possivel de cada nota sendo 100, 50, 20, 10, 5 e 2
        int notasCem = notas/100;      
        restoNotas = (notas-notasCem*100);       
        int notasCinquenta = restoNotas/50;
        restoNotas -= notasCinquenta*50;
        int notasVinte = restoNotas/20;
        restoNotas -= notasVinte*20;
        int notasDez = restoNotas/10;
        restoNotas -= notasDez*10;
        int notasCinco = restoNotas/5;
        restoNotas -= notasCinco*5;
        int notasDois = restoNotas/2;
        restoNotas -= notasDois*2;
        int notasUm = restoNotas;
       
        
        //checa o maior valor possivel de cada moeda sendo 50, 25, 10, 5 e 1
        int moedasCinquenta = moedas/50;
        restoMoedas = (moedas-moedasCinquenta*50);
        int moedasVinteECinco = restoMoedas/25;
        restoMoedas -= moedasVinteECinco*25;
        int moedasDez = restoMoedas/10;
        restoMoedas -= moedasDez*10;
        int moedasCinco = restoMoedas/5;
        restoMoedas -= moedasCinco*5;
        int moedasUm = restoMoedas;

        System.out.println("NOTAS:");
        System.out.println(notasCem + " nota(s) de R$ 100.00");
        System.out.println(notasCinquenta + " nota(s) de R$ 50.00");
        System.out.println(notasVinte + " nota(s) de R$ 20.00");
        System.out.println(notasDez + " nota(s) de R$ 10.00");
        System.out.println(notasCinco + " nota(s) de R$ 5.00");
        System.out.println(notasDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(notasUm + " moeda(s) de R$ 1.00");
        System.out.println(moedasCinquenta + " moeda(s) de R$ 0.50");
        System.out.println(moedasVinteECinco + " moeda(s) de R$ 0.25");
        System.out.println(moedasDez + " moeda(s) de R$ 0.10");
        System.out.println(moedasCinco + " moeda(s) de R$ 0.05");
        System.out.println(moedasUm + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
