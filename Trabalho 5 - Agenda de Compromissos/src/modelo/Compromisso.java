package modelo;

import java.util.ArrayList;

public class Compromisso {
    public Data date;
    public Hora hora;
    public String local;
    public String status;
    ArrayList<String> listaPessoas;

    public Compromisso(int dia, int mes, int ano, int hora, int min, String local, String status){
        this.date = new Data(dia, mes, ano);
        this.hora = new Hora(hora, min);
        this.local = local;
        this.status = status;
        listaPessoas = new ArrayList<String>();
    }
    public void adcionarPessoas(String pessoa){
        listaPessoas.add(pessoa);
    }

    public void printarCompromisso() {
        System.out.println("Compromisso{" +
                "date=" + date +
                ", hora=" + hora +
                ", local='" + local + '\'' +
                ", status='" + status + '\'' +
                '}');
        listaPessoasCompromisso();
    }
    public void listaPessoasCompromisso(){
        System.out.println("Lista de Pessoas que estarão neste compromisso:");
        for(int i = 0; i < listaPessoas.size(); i++){
            System.out.println(listaPessoas.get(i));
        }
    }

}
