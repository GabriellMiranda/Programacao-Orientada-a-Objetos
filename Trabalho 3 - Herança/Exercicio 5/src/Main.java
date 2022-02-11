import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random gerador = new Random();
        Jogo jogar = new Jogo(1 + gerador.nextInt(10));
    }
}
