public class Main {
    public static void main(String[] args){
        Produto produto = new Produto(1);
        for(int i = 0; i < 10; i++) {
            produto.testaUnidade();
            System.out.println(produto);
            System.out.println("-------------------------------");
        }
    }
}
