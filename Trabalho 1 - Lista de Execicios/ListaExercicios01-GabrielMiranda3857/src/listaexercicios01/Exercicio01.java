
/**Gabrie Miranda - 3857
 * 1. Determine qual é a idade que o usuário faz no ano atual. Para isso solicite
como entrada o ano de nascimento do usuário e o ano atual.
 */

package listaexercicios01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args){
        int ano_atual, ano_nascimento, idade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento:");
        ano_nascimento = scan.nextInt();
        System.out.println("Digite o ano atual:");
        ano_atual = scan.nextInt();
        idade = ano_atual - ano_nascimento;
        System.out.println("A sua idade é:"+idade);
    }
    
}
