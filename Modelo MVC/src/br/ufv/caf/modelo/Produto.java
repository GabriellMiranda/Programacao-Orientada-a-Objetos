package br.ufv.caf.modelo;

public class Produto {
    private String nome;
    private int codigo;

    public Produto(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String toString(){
        return "Produto: "+this.codigo + ", nome: "+this.nome;
    }

    public int getCodigo(){
        return codigo;
    }

}

