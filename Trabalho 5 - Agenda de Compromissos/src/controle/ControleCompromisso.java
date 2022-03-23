package controle;
import  modelo.Compromisso;


import java.util.Scanner;
import java.util.logging.Logger;
import Dao.AgendaDao;

public class ControleCompromisso {
    AgendaDao agendaDao = new AgendaDao();
    protected Scanner scan;
    protected Compromisso compromisso;
    private static final Logger LOGGER = Logger.getLogger("ControlePromisso");

    public ControleCompromisso(){
        scan = new Scanner(System.in);
    }


    public void inserirCompromisso(Compromisso compromisso){
        if(!(agendaDao.verificaComflito(compromisso.date.getDia(), compromisso.hora.getHora()))){
            return;
        }
        agendaDao.cadastrasCompromisso(compromisso);

        int qtd = 0;
        try {
            System.out.println("Quantas pessoas estarao neste compromisso:");
            qtd = scan.nextInt();
            System.out.println("Digite o nome dos participantes do compromisso!!");
            for(int i = 0; i < qtd; i++){
                String nome;
                System.out.println("Digite o nome da pessoa:");
                nome = scan.next();
                compromisso.adcionarPessoas(nome);
            }
        }catch (Exception ee){
            LOGGER.info("Digite um valor inteiro!!"+ee.getMessage());
        }

    }
    public void removerCompromisso(int dia, int hora){
        if(agendaDao.removerCompromisso(dia, hora)){
            System.out.println("Compromisso removido com sucesso!!");
        }else {
            System.out.println("Nenhum compromisso foi removido, verifique a data e hora!!");
        }
    }
    public void listaCompromissos(int dia){
        agendaDao.listarCompromissos(dia);
    }

    public void listarAgendaCompleta(){
        agendaDao.listaCompromissosAgendaAscendente();
    }

}
