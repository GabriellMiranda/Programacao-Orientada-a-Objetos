import java.util.Objects;

public class Papel implements Objeto{
    protected String nome;
    public Papel(){
        nome="Papel";
    }
    @Override
    public String tipoVitoria() {
        return "envolve";
    }

    @Override
    public boolean vitoria(Objeto rival) {
        return Objects.equals("Pedra",rival.toString());
    }

    @Override
    public String toString() {
        return nome;
    }
}
