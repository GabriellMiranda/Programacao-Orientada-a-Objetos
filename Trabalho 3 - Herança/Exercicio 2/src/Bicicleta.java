
public class Bicicleta extends Veiculo{

    public Bicicleta(int numeroRodas) {
        super(numeroRodas);
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

}
