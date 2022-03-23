package modelo;

import java.util.logging.Logger;

public class Data {
    private static final Logger LOGGER = Logger.getLogger("Data");
    protected int dia;
    protected int mes;
    protected int ano;


    public Data(int dia,int mes,int ano){
        setAno(ano);
        setDia(dia);
        setMes(mes);
    }

    public void setAno(int ano){
       if(ano > 2021){
           this.ano = ano;
       }else{
           LOGGER.info("Ano invalido!!, será adicionado zero");
           this.ano = 0;
       }

    }
    public void setDia(int dia){
        if(dia > 0 && dia < 32){
            this.dia = dia;
        }else {
            LOGGER.info("Dia Invalido!!, será adicionado zero");
            this.dia = 0;
        }
    }

    public void setMes(int mes) {
        if(mes > 0 && mes < 13){
            this.mes = mes;
        }else{
            LOGGER.info("Mes invalido!!, será adicionado zero");
            this.mes = 0;
        }
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return this.dia;
    }

    public String toString(){
        return Integer.toString(this.dia) + "/" + Integer.toString(this.mes) + "/" + Integer.toString(this.ano);
    }

}
