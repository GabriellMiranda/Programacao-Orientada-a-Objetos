public abstract class Veiculo {
    protected int numeroRodas;
    protected float velocidade;

    public Veiculo(int numeroRodas) {
        this.numeroRodas = numeroRodas;
        this.velocidade = 0;
    }

    public abstract int getNumeroRodas();

    public abstract void acelerar(float velocidade);

    public abstract void parar();

}
