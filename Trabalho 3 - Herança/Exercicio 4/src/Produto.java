import java.lang.Math;

public class Produto {
    protected int numeroSerial;
    protected int volume;
    protected String tipo;

    public Produto(int numeroSerial){
        this.numeroSerial = numeroSerial;
        this.tipo = "não testado";
    }

    public boolean testaUnidade(){
        float valor = (float) Math.random();
        System.out.println(valor);
        if(valor <= 0.9){
            this.tipo = "aprovado";
            return true;
        }else{
            this.tipo = "reprovado";
            return false;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numeroSerial=" + numeroSerial +
                ", volume=" + volume +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
