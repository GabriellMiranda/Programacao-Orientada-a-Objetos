package modelo;

import java.util.Arrays;
import java.util.Objects;

public class StringBits extends Array {
    private int n;
    private String palavra[];
    public StringBits(int n) {
        this.n = n;
        palavra = new String[n];
    }
    @Override
    public int acessarBit(int var) {
        return Integer.parseInt(palavra[var]);
    }

    @Override
    public void modificarBit(int var, int valor) {
        try {
            if(valor == 0 || valor == 1) {
                palavra[var] = String.valueOf(valor);
            }else{
                System.out.println("Só é possível digitar 0 ou 1");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Indexação errada!!");
        }
    }

    public boolean equals(String[] vet) {
        for(int i = 0; i < vet.length; i++){
            if(Objects.equals(vet[i], palavra[i])){
            }else{
                return false;
            }
        }
        return true;
    }


    public String[] AND(String[] vet) {
       if(vet.length > palavra.length){
           System.err.println("O vetor passado é maior que o da class!!");
           return null;
       }
        String[] vet3 = new String[n];
        for(int i = 0; i < n; i++){
            if(Objects.equals(palavra[i], "1") && Objects.equals(vet[i], "1")){
                vet3[i] = String.valueOf('1');
            }else{
                vet3[i] = String.valueOf('0');
            }
        }
        return vet3;
    }


    public String[] OR(String[] vet) {
        if(vet.length > palavra.length){
            System.err.println("O vetor passado é maior que o da class!!");
            return null;
        }
        String[] vet3 = new String[n];
        for(int i = 0; i < n; i++){
            if(Objects.equals(palavra[i], "1") || Objects.equals(vet[i], "1")){
                vet3[i] = String.valueOf('1');
            }else{
                vet3[i] = String.valueOf('0');
            }
        }
        return vet3;
    }


    public String[] NOT() {
        String[] vet = new String[n];
        for(int i = 0; i < n;i++){
            vet[i] = palavra[i];
        }
        for(int i = 0; i < n; i++){
            if(Objects.equals(vet[i], "1")){
                vet[i] = String.valueOf('0');
            }else{
                vet[i] = String.valueOf('1');
            }
        }
        return vet;
    }

    @Override
    public String toString() {
        return Arrays.toString(palavra);
    }

}
