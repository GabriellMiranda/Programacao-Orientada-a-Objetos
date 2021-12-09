/*
 *5. Verifique a validade de uma data de aniversário (solicite apenas o número
do dia e do mês). Além de falar se a data está válida, informe também o
nome do mês. Dica: meses com 30 dias: abril, junho, setembro e novembro.
 */
package listaexercicios01;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Exercicio05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dia, mes;
        System.out.println("Digite o dia do seu nascimento:");
        dia = scan.nextInt();
        System.out.println("Digite o mês de sua nascimento:");
        mes = scan.nextInt();
        if(dia <= 31 && mes == 1){
          System.out.println("Data Válida! Você nasceus em Janeiro.");
        }
        else if(dia <= 28 && mes == 2){
            System.out.println("Data válida! Você nasceu em Fevereiro.");
        }
        else if(dia <= 31 && mes == 3){
            System.out.println("Data Váida! Você nasceu em Março.");
        }
        else if(dia <= 30 && mes == 4){
            System.out.println("Data Válida! Você nasceu em Abril.");
        }
        else if(dia <= 31 && mes == 5){
            System.out.println("Data Válida! Você nasceu em Maio.");
        }
        else if(dia <= 30 && mes == 6){
            System.out.println("Data Válida! Você nasceu em Junho.");
        }
        else if(dia <= 31 && mes == 7){
            System.out.println("Data Válida! Você nasceu em Julho.");
        }
        else  if(dia <= 31 && mes == 8){
            System.out.println("Data Válida! Você nasceu em Agosto.");
        }
        else if(dia <= 30 && mes == 9){
            System.out.println("Data Válida! Você nasceu em Setembro.");
        }
        else if(dia <= 31 && mes == 10){
            System.out.println("Data Válida! Você nasceu em Outubro.");
        }
        else if(dia <= 30 && mes == 11){
            System.out.println("Data Válida! Você nasceu em Novembro.");
        }
        else if(dia <= 31 && mes == 12){
            System.out.println("Data Válida! Você nasceu em Dezembro.");
        }else{
            System.out.println("Data Invalida!!");
        }
    }
}
