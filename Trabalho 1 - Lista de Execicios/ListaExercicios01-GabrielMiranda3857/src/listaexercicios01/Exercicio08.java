/*
 * 8. Escreva um programa Java que leia da entrada padrão números inteiros até
encontrar a palavra “fim”, ordene de forma crescente os números lidos e
imprima na saída padrão o conjunto ordenado dos números.

 */
package listaexercicios01;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author gabri
 */
public class Exercicio08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        ArrayList<Integer> lista = new ArrayList<>();
        int valor;
        String leia = "";
        
        while(true){
            System.out.println("Digite um número: finalize com - fim");
            leia = scan.nextLine();
            if(leia.equals("fim")){
                break;
            }
            valor = Integer.parseInt(leia);
            lista.add(valor);
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}
