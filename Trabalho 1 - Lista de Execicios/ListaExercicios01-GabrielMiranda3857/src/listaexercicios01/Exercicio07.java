/*
 * Escreva um programa em Java que leia da entrada padrão um número inteiro
N, 0 < N < 1000, depois leia N números inteiros e imprima na saída padrão o
menor valor, a média aritmética, o maior valor, a quantidade de números
pares e a quantidade de números ímpares.
 */
package listaexercicios01;

import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class Exercicio07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N, valor, maior = 0, menor = 0, media = 0, pares = 0, impares = 0;
        System.out.println("Digite o valor de N:");
        N = scan.nextInt();
        for(int i = 0; i < N; i++){
            System.out.println("Digite o valor:");
            valor = scan.nextInt();
            media = media + valor;
            if(i == 0){
                maior = valor;
                menor = valor;
            }
            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
            if(valor % 2 == 0){
                pares = pares + 1;
            }else{
                impares=impares + 1;
            }
        }
        media = media/N;
        System.out.println("menor valor:"+menor+""
        + ",a média aritmética:"+media+", o maior valor:"+maior+", a quantidade de número pares:"+pares+""
        + " e a quantidade de números ímpares:"+impares);
    }
}
