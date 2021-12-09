/*
4. Receba do usuário o nome de um mês e exiba o número equivalente. Ex.
"Janeiro" = 1

 */
package listaexercicios01;
import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class Exercicio04 {
    public static void main(String[] args){
        String leia;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o mês:");
        leia = scan.nextLine();
        
        if(leia.equals("janeiro")){
            System.out.println("1");
        }
        if(leia.equals("fevereiro")){
            System.out.println("2");
        }
        if(leia.equals("março")){
            System.out.println("3");
        }
        if(leia.equals("Abril")){
            System.out.println("4");
        }
        if(leia.equals("maio")){
            System.out.println("5");
        }
        if(leia.equals("junho")){
            System.out.println("6");
        }
        if(leia.equals("julho")){
            System.out.println("7");
        }
        if(leia.equals("agosto")){
            System.out.println("8");
        }
        if(leia.equals("setembro")){
            System.out.println("9");
        }
        if(leia.equals("outubro")){
            System.out.println("10");
        }
        if(leia.equals("novembro")){
            System.out.println("11");
        }
        if(leia.equals("dezembro")){
            System.out.println("12");
        }
    }
}
