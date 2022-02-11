import javax.swing.*;

public abstract class Forma {
    protected String tipo;

    public Forma(String tipo){
        this.tipo = tipo;
    }
    public abstract float calcularArea();

    public abstract float calcularPerimetro();

    public String getTipo(){
        return tipo;
    }
}
