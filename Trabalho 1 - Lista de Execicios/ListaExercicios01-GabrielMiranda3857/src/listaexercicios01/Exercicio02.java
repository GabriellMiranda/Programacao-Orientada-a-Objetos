/**Gabriel Miranda - 3857
2. Transforme um número Racional (formado por numerador e denominador)
em um número Real. Antes de dividir, verifique se o denominador é
diferente de zero. Imprima uma mensagem de alerta ao usuário se for zero.
 */
package listaexercicios01;

import java.util.Scanner;

public class Exercicio02 {
      public static void main(String[] args){
          float numerador, denominador, numero_real;
          Scanner scan = new Scanner(System.in);
          System.out.println("Digite o numerador:");
          numerador = scan.nextFloat();
          System.out.println("Digite o denominador:");
          denominador = scan.nextFloat();
          if(denominador == 0){
              System.out.println("ERROR!! O denominador é 0!!");
          }else{
              numero_real = numerador/denominador;
              System.out.println("Numero Real:"+numero_real);
          }     
      }
}
