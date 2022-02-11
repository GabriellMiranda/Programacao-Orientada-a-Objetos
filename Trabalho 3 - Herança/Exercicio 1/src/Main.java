public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        CalculatorScientific scientific = new CalculatorScientific();
        int n1 = 2, n2 = 4;
        System.out.println("Calculadora:");
        System.out.println("Soma:"+n1+"+"+n2+" = "+calculator.som(n1,n2));
        System.out.println("multiplicaçao:"+n1+" * "+n2+" = "+calculator.multiplication(n1,n2));
        System.out.println("Subtração:"+n1+" - "+n2+" = "+calculator.subtraction(n1,n2));
        System.out.println("divisão:"+n1+"/"+n2+" = "+calculator.divisor(n1,n2));
        System.out.println("------------------------------------------------");
        System.out.println("Calculadora Ciêntifica:");
        System.out.println("soma:"+n1+"+"+n2+" = "+scientific.som(n1,n2));
        System.out.println("Subtração:"+n1+" - "+n2+" = "+scientific.subtraction(n1,n2));
        System.out.println("multiplicaçao:"+n1+" * "+n2+" = "+scientific.multiplication(n1,n2));
        System.out.println("divisão:"+n1+"/"+n2+" = "+scientific.divisor(n1,n2));
        System.out.println("Raiz quadrada de "+n2+" = "+scientific.sqrt(n2));
        System.out.println("Exponenciação:"+n1+" ^ "+n2+" = "+scientific.exponentiation(n1,n2));
    }
}
