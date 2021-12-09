/*
 * 10. Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A
cada tentativa dele, forneça uma dica falando se o número é maior ou menor.
Quando ele descobrir, exiba uma mensagem de parabéns e mostre em
quantas tentativas ele conseguiu. Utilize uma biblioteca para gerar um
número aleatório.
 */
package listaexercicios01;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author gabriel
 */
public class Exercicio10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = 1 + random.nextInt(99);
        int numero, cont = 0;
       /* System.out.println("Valor:"+aleatorio);*/
        while(true){
            System.out.println("Digite o valor:");
            numero = scan.nextInt();
            cont = cont + 1;
            if (numero == aleatorio){
                System.out.println("Parabens!! Você acertou.");
                break;
            }
            else if(numero < aleatorio){
                System.out.println("Numero é maior!!");
            }
            else if(numero > aleatorio){
               System.out.println("Numero é menor!!"); 
            }
        }   
        System.out.println("Você tentou:"+cont+" vezes");
    }
}
