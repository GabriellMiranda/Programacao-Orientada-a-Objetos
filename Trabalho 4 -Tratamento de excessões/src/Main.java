import modelo.Array;
import modelo.ArrayBits;
import modelo.StringBits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayBits arrayBits = new ArrayBits(3);
        int[] aux = {1,0,1}; // Vetor que será usado para comparações do vetor de inteiros
        System.out.println("Vetor Aux:");
        System.out.println(Arrays.toString(aux));
        System.out.println(">>>>>>>>>> Array de Bits <<<<<<<<<");
        arrayBits.modificarBit(0, 0);
        arrayBits.modificarBit(1, 1);
        arrayBits.modificarBit(2, 1);
        System.out.println("Vetor da classe:");
        System.out.println(arrayBits.toString()); //imprimindo o vetor
        if(arrayBits.equals(aux)){
            System.out.println("vetor aux é igual ao arrayBits");
            System.out.println("Vetor Aux:"+Arrays.toString(aux) + " = " +"ArrayBits :"+ arrayBits.toString());
        }else{
            System.out.println("Vetor diferente");
            System.out.println("Vetor Aux:"+Arrays.toString(aux) + " != " +"ArrayBits :"+ arrayBits.toString());
        }

        System.out.println("bit acessado:"+arrayBits.acessarBit(2));
        System.out.println(arrayBits.toString()+ " Not = " + Arrays.toString(arrayBits.NOT()));

        System.out.println(arrayBits.toString() + " OR "+ Arrays.toString(aux) +" = "+ Arrays.toString(arrayBits.OR(aux)));
        System.out.println(arrayBits.toString() + " AND "+ Arrays.toString(aux) +" = "+ Arrays.toString(arrayBits.AND(aux)));

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("\n>>>>>>>>>> Array de String <<<<<<<<<");
        String[] aux1 = {"1","0","1"}; //Vetor que será usando para os testes de comparação da StringArray
        StringBits stringbits = new StringBits(3);
        stringbits.modificarBit(0,1);
        stringbits.modificarBit(1,1);
        stringbits.modificarBit(2,0);
        System.out.println(stringbits.toString());
        if(stringbits.equals(aux1)){
            System.out.println("vetor aux é igual ao arrayBits");
            System.out.println("Vetor Aux:"+Arrays.toString(aux1) + " = " +"ArrayBits :"+ stringbits.toString());
        }else{
            System.out.println("Vetor diferente");
            System.out.println("Vetor Aux:"+Arrays.toString(aux1) + " != " +"ArrayBits :"+ stringbits.toString());
        }

        System.out.println("bit acessado:"+stringbits.acessarBit(2));
        System.out.println(stringbits.toString()+ " Not = " + Arrays.toString(stringbits.NOT()));

        System.out.println(stringbits.toString() + " OR "+ Arrays.toString(aux1) +" = "+ Arrays.toString(stringbits.OR(aux1)));
        System.out.println(stringbits.toString() + " AND "+ Arrays.toString(aux1) +" = "+ Arrays.toString(stringbits.AND(aux1)));
        System.out.println("-----------------------------------------------------------------------");

    }



}
