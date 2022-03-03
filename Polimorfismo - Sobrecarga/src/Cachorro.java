import java.util.Objects;
//Varios métodos com os mesmos nomes polimorfismo Sobrecarga
public class Cachorro extends Mamifero {
    @Override
    public void emitirSom(){
        System.out.println("Au, Au, Au");
    }

    public void reagir(String frase){
        if(Objects.equals(frase, "Toma comida") || Objects.equals(frase, "Ola")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Aba");
        }else if( hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            }else{
                System.out.println("latir");
            }
        }else{
            if(peso < 10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
