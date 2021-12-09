/*
 3. Um banco concede empréstimo a seus clientes no valor máximo de 30% do
valor do seu salário. Faça um programa que receba o valor do salário e o
valor do pedido de empréstimo de um cliente, e em seguida avise se ele
poderá ou não fazer o empréstimo.
 */
package listaexercicios01;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Exercicio03 {
    public static void main(String[] args){
        float salario_usuario, emprestimo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        salario_usuario = scan.nextFloat();
        System.out.println("Digite o valor do emprestimo:");
        emprestimo = scan.nextFloat();
        if((salario_usuario*0.3) >= emprestimo){
            System.out.println("Parabéns você poderá fazer o emprestimo!!");
        }else{
            System.out.println("Infelizmente seu salario não é compatível com os critérios de emprestimos de nossa empresa!!");
        }
    }
}
