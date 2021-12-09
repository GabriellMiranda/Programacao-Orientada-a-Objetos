/*
 * 6. Escreva um programa que receba 2 horários (horas, minutos e segundos) e
exiba a diferença entre eles em segundos.
 */
package listaexercicios01;
import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class Exercicio06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String hora1, hora2;
        int hor1, min1, seg1, hor2, min2, seg2;
        System.out.println("Digite a 1º Hora: Ex: 00:00:00");
        hora1 = scan.nextLine();
        System.out.println("Digite a 2º Hora: Ex: 00:00:00");
        hora2 = scan.nextLine();
        hor1 = Integer.parseInt(hora1.substring(0, 2));
        min1 = Integer.parseInt(hora1.substring(3, 5));
        seg1 = Integer.parseInt(hora1.substring(6, 8));
        hor2 = Integer.parseInt(hora2.substring(0, 2));
        min2 = Integer.parseInt(hora2.substring(3, 5));
        seg2 = Integer.parseInt(hora2.substring(6, 8));
        int tempo_segundos1 = (hor1*3600) + (min1*60) + seg1;
        int tempo_segundos2 = (hor2*3600) + (min2*60) + seg2;
        if(tempo_segundos1 > tempo_segundos2){
            System.out.println("Diferença em segundos:"+(tempo_segundos1 - tempo_segundos2));
        }else{
            System.out.println("Diferença em segundos:"+(tempo_segundos2 - tempo_segundos1));
        }
        
    }
}
