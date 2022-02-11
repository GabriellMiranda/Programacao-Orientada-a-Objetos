import java.util.Objects;

public class Tesoura implements Objeto{
    protected String nome;
    public Tesoura(){
        nome="Tesoura";
    }

    @Override
    public String tipoVitoria() {
        return " corta ";
    }

    @Override
    public boolean vitoria(Objeto rival) {
        return Objects.equals("Papel",rival.toString());
    }

    @Override
    public String toString() {
        return nome;
    }
}
