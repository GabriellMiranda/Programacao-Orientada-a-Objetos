
public class Main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro dog = new Cachorro();

        m.setPeso(35.6f);
        m.setCorPelo("marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        r.locomover();
        a.locomover();
        System.out.println("---Canguru---");
        c.locomover();
        System.out.println("---Cachorro---");
        dog.emitirSom();

    }

}
