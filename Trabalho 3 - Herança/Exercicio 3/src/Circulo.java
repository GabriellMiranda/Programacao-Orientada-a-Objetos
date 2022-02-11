public class Circulo extends Forma{
    protected float raio;

    public Circulo(float raio, String Tipo){
        super(Tipo);
        this.raio = raio;
    }
    @Override
    public float calcularArea(){
        return (float) ((Math.PI)*(raio*raio));
    }

    @Override
    public float calcularPerimetro(){
        return (float) (2*(Math.PI)*raio);
    }

    @Override
    public String toString() {
        return "raio=" + raio ;

    }
}
