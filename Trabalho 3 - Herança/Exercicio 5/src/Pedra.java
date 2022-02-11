import java.util.Objects;

public class Pedra  implements Objeto{
    protected String nome;
    public Pedra(){
        nome = "Pedra";
    }

    @Override
    public String tipoVitoria() {
        return "quebra";
    }

    @Override
    public boolean vitoria(Objeto rival) {
        return Objects.equals("Tesoura",rival.toString());
    }

    @Override
    public String toString() {
        return nome;
    }
}
