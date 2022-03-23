package Dao;
import java.util.ArrayList;
import java.util.logging.Logger;

import modelo.Compromisso;
public class AgendaDao {
    private ArrayList<Compromisso> listaCompromissos;
    private static final Logger LOGGER = Logger.getLogger("AgendaDao");

    public AgendaDao(){
        listaCompromissos = new ArrayList<>();
    }

    public boolean verificaComflito(int dia, int hora){
        for(int i = 0; i < listaCompromissos.size(); i++){
            if(listaCompromissos.get(i).date.getDia() == dia && listaCompromissos.get(i).hora.getHora() == hora){
                LOGGER.info("Não se pode adcionar este compromisso!!");
                return false;
            }
        }
        return  true;
    }

    public void cadastrasCompromisso(Compromisso compromisso){
        listaCompromissos.add(compromisso);
    }
    public boolean removerCompromisso(int dia, int hora){
        for(int i = 0; i < listaCompromissos.size(); i++){
            if(listaCompromissos.get(i).date.getDia() == dia && listaCompromissos.get(i).hora.getHora() == hora){
                listaCompromissos.remove(i);
                return true;
            }
        }
        return false;
    }
    public void listarCompromissos(int dia){
        for(int i = 0; i < listaCompromissos.size(); i++){
            if(listaCompromissos.get(i).date.getDia() == dia){
                System.out.println("==============================");
                listaCompromissos.get(i).printarCompromisso();
                System.out.println("==============================");
            }

        }
    }

    public void listaCompromissosAgendaAscendente(){
        for (Compromisso listaCompromisso : listaCompromissos) {
            System.out.println("==============================");
            listaCompromisso.printarCompromisso();
            System.out.println("==============================");
        }
    }


}
