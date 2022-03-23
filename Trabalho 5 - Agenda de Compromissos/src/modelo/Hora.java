package modelo;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.logging.Logger;

public class Hora {
    private static final Logger LOGGER = Logger.getLogger("Hora");
    protected int hora;
    protected int min;

    public Hora(int hora,int min){
       setHora(hora);
       setMin(min);
    }

    public void setHora(int hora) {
        if(hora > -1 && hora <25){
            this.hora = hora;
        }else{
            LOGGER.info("Hora Invalida!!, será adicionado zero");
            this.hora = 0;
        }

    }
    public void setMin(int hora) {
        if(min > -1 && hora <61){
            this.hora = hora;
        }else{
            LOGGER.info("Min Invalida!!, será adicionado zero!!");
            this.min = 0;
        }

    }

    public int getHora() {
        return hora;
    }
    public int getMin(){
        return min;
    }
    public String toString(){
        return Integer.toString(this.hora) + ":" + Integer.toString(this.min);
    }

}
