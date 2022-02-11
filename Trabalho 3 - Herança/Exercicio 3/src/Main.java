import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        int n = 10;
        int valor;
        ArrayList<Forma> formas = new ArrayList<Forma>();
        for(int i = 0; i < n; i++){
            Random gerador = new Random();
            valor = gerador.nextInt(3);
            if(valor == 0){
                Forma retangulo = new Retangulo(gerador.nextInt(10), gerador.nextInt(10), "Retangulo");
                formas.add(retangulo);
            }else if(valor == 1){
                Forma circulo = new Circulo(gerador.nextInt(10), "circulo");
                formas.add(circulo);
            }else if(valor == 2){
                Forma quadrado = new Quadrado(gerador.nextInt(10), "Quadrado");
                formas.add(quadrado);
            }
        }
        for (Forma forma : formas){
            System.out.println("---------------------------------------");
            System.out.println(forma.getTipo());
            System.out.println(forma);
            System.out.println("Area:"+forma.calcularArea());
            System.out.println("Perimetro:"+forma.calcularPerimetro());
            System.out.println("---------------------------------------");
        }

    }
}

