package modelo;

import java.util.Arrays;

public class ArrayBits extends Array {
    private int n;
    private int vetor[];
    public ArrayBits(int n){
        this.n = n;
        vetor = new int[n];
    }
    //acessando um bit com uma posição passada
    @Override
    public int acessarBit(int var){ //pode acessa posição
      if(var < vetor.length && var >= 0){
        return vetor[var];
      }else{
          return -1;
      }
    }

    @Override
    public void modificarBit(int var, int valor){
       if(var >= n && var < 0){
           System.out.println("Indexação incorreta!!");

       }
       else if(valor == 0 || valor == 1) {
           vetor[var] = valor;
       }else{
           System.err.println("Só é possível adcionar 0 ou 1");
           System.err.println("será adicioando 0!!");
       }

    }

    public boolean equals(int[] vet){
      try {
          for (int i = 0; i < vet.length; i++) {
              if (vet[i] == this.vetor[i]) {
              } else {
                  return false;
              }
          }
      }catch (ArrayIndexOutOfBoundsException err){
          System.err.println("Erro de indexação!!, O vetor passado é maior que o vetor atual.");
      }
       return true;
    }

    public int[] AND(int[] vet){
        if(vet.length > vetor.length){
            System.err.println("O vetor passado é maior que o da class!!");
            return null;
        }
        int[] vet3 = new int[n];
        for(int i = 0; i < n; i++){
            if(vetor[i] == 1 && vet[i] == 1){
                vet3[i] = 1;
            }else{
                vet3[i] = 0;
            }
        }
        return vet3;
    }

    public int[] OR(int[] vet){
        if(vet.length > vetor.length){
            System.err.println("O vetor passado é maior que o da class!!");
            return null;
        }
        int[] vet3 = new int[n];
        for(int i = 0; i < n; i++){
            if(vetor[i] == 1 || vet[i] == 1 ){
                vet3[i] = 1;
            }else{
                vet3[i] = 0;
            }
        }
        return vet3;
    }


    public int[] NOT(){
        int[] vet = new int[n];
        for(int i = 0; i < n;i++){
            vet[i] = vetor[i];
        }
        for(int i = 0; i < n; i++){
            if(vet[i] == 1){
                vet[i] = 0;
            }else{
                vet[i] = 1;
            }
        }
        return vet;
    }
    @Override
    public String toString(){
        return Arrays.toString(vetor);
    }

}
