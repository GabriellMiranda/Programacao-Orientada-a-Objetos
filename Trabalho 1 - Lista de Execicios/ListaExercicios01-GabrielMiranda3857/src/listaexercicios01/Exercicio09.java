/*
 9. Crie uma calculadora que funcione através da linha de comando. Esta
calculadora deve receber comandos aritméticos, e após receber cada
comando deve realizar o cálculo e exibir o resultado. Os comandos são no
formato:
MULTIPLICA A POR B
DIVIDE A POR B
SOMA A E B
SUBTRAI A DE B
Exemplo:
MULTIPLICA 10
 */
package listaexercicios01;
import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class Exercicio09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String leia = " ";
        leia = scan.nextLine();
        String[] Instrucao = leia.split(" ");
        double A = Integer.parseInt(Instrucao[1]);
        double B = Integer.parseInt(Instrucao[3]);
        double resposta = 0;
        if(Instrucao[0].equals("MULTIPLICA")){
            resposta = A * B;
        }else if(Instrucao[0].equals("DIVIDE")){
            resposta = A/B;
        }else if(Instrucao[0].equals("SOMA")){
            resposta = A + B;
        }else if(Instrucao[0].equals("SUBTRAI")){
            resposta = B - A;
        }
        System.out.println("Resposta:"+resposta);
    }
}
