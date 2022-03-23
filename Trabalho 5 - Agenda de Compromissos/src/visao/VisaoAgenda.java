package visao;


import java.util.Scanner;
import java.util.logging.Logger;
import controle.ControleCompromisso;
import modelo.Compromisso;

public class VisaoAgenda {
    protected Scanner scan;
    ControleCompromisso controleCompromisso;
    private static final Logger LOGGER = Logger.getLogger("VisaoAgenda");
    public VisaoAgenda(){
        controleCompromisso = new ControleCompromisso();
        scan = new Scanner(System.in);
    }
    public int menuAgenca(){
        int opcao = 0;
        System.out.println("=================================================");
        System.out.println("[1] - Cadastrar um novo compromisso:");
        System.out.println("[2] - Remover um compromisso:");
        System.out.println("[3] - Lista compromissos de um dia específico:");
        System.out.println("[4] - Listar compromissos em ordem ascendente:");
        System.out.println("[0] - Sair:");
        System.out.println("=================================================");
        System.out.println("Opcao: ");
        try {
            opcao = scan.nextInt();
        }catch (Exception ee){
            LOGGER.info("Digite um valor inteiro!!"+ee.getMessage());
        }
        return opcao;
    }

    public void telaAgenda(){
        VisaoCompromisso visaoCompromisso = new VisaoCompromisso();
        while (true){
            int opcao = menuAgenca();
            if(opcao == 0){
                break;
            }else if(opcao == 1){
                Compromisso compromisso = visaoCompromisso.cadastrarCompromisso();
                controleCompromisso.inserirCompromisso(compromisso);
            }else if(opcao == 2){
                try {
                    System.out.println("Digite o dia:");
                    int dia = scan.nextInt();
                    System.out.println("Digite a hora:");
                    int hora = scan.nextInt();
                    controleCompromisso.removerCompromisso(dia, hora);
                }catch (Exception e){
                    LOGGER.info("Digite valores inteiros!!"+e.getMessage());
                }
            }else if(opcao == 3){
                System.out.println("Digite o dia:");
                int dia = scan.nextInt();
                controleCompromisso.listaCompromissos(dia);
            }else if(opcao == 4){
                 System.out.println("==== Compromissos da Agenda ====");
                controleCompromisso.listarAgendaCompleta();
            }
        }
    }

}
