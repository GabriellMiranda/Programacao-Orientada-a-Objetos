package visao;
import modelo.Compromisso;

import java.util.Scanner;

public class VisaoCompromisso {
    private Compromisso compromisso;
    private Scanner scan;

    public VisaoCompromisso(){
        scan = new Scanner(System.in);
    }

    public Compromisso cadastrarCompromisso(){
        int dia, mes, ano, hora, min;
        String local, status;
        System.out.println("Digite o dia:");
        dia = scan.nextInt();
        System.out.println("Digite o mes:");
        mes = scan.nextInt();
        System.out.println("Digite o ano:");
        ano = scan.nextInt();
        System.out.println("Digite a hora:");
        hora = scan.nextInt();
        System.out.println("Digite o minuto:");
        min = scan.nextInt();
        System.out.println("Digite o local:");
        local = scan.next();
        System.out.println("Digite o Status:");
        status = scan.next();
        Compromisso compromisso = new Compromisso(dia, mes, ano, hora, min, local, status);
        return compromisso;
    }


}
