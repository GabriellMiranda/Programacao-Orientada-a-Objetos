import java.util.Calendar;

public class Automovel extends Veiculo{
    private date ultimaTrocaOleo;
    public Automovel(int numberWheels) {
        super(numberWheels);
        ultimaTrocaOleo = null;
    }

    public int getNumeroRodas(){
        return this.numeroRodas;
    }


    public void acelerar(float velocidade){
        this.velocidade += velocidade;
    }

    public void parar(){
        this.velocidade = 0;
    }

    public void trocarOleo(){
        Calendar c;
        c = Calendar.getInstance();
        ultimaTrocaOleo = new date(c.get(Calendar.DAY_OF_MONTH),c.get(Calendar.MONTH),c.get(Calendar.YEAR));
    }

    public String toString() {
        return " Automovel{" +
                "ultima Troca de Oleo=" + ultimaTrocaOleo.toString()+
                "}\n";
    }
}

class date{
    private int dia;
    private int mes;
    private int ano;

    public date(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public String toString(){
        return Integer.toString(this.dia) + "/" + Integer.toString(this.mes+1) + "/" + Integer.toString(this.ano);
    }
}