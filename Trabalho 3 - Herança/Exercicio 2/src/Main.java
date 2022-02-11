public class Main {
    public static void main(String[] args){
        Bicicleta bike = new Bicicleta(2);
        Automovel car = new Automovel(4);
        System.out.println("Bicicleta:");
        System.out.println("numero de rodas:"+bike.getNumeroRodas());
        System.out.println("Aumentado a velocidade em 20:");
        bike.acelerar(20);
        System.out.println(bike.velocidade);
        System.out.println("Parando");
        bike.parar();
        System.out.println("velocidade:"+bike.velocidade);
        System.out.println("----------------------------------------");
        System.out.println("Carro:");
        System.out.println("numero de rodas:"+car.getNumeroRodas());
        car.trocarOleo();
        System.out.println(car);
    }
}
