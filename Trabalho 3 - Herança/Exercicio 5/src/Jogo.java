import java.util.Random;

public class Jogo {
    Objeto[] Objetos;
    Objeto Papel, Pedra, Tesoura;
    protected int numeroVezes;
    public Jogo(int numeroVezes){
        int ale1, ale2;
        this.numeroVezes = numeroVezes;
        Objetos = new Objeto[]{Papel = new Papel(),Pedra = new Pedra(),Tesoura = new Tesoura()};
        for(int i = 0; i < numeroVezes; i++){
            Random gerador = new Random();
            this.Jogar(Objetos[gerador.nextInt(3)], Objetos[gerador.nextInt(3)]);
        }
    }
    public void Jogar(Objeto obj1, Objeto obj2){
        if(obj1.vitoria(obj2)){
            System.out.println(obj1.toString() +" - "+ obj1.tipoVitoria() +" - "+  obj2.toString());
        }else if(obj2.vitoria(obj1)){
            System.out.println(obj2.toString() +" - "+ obj2.tipoVitoria() +" - "+ obj1.toString());
        }else{
            System.out.println(obj2.toString() + " empate com " + obj1.toString());
        }
    }
}
