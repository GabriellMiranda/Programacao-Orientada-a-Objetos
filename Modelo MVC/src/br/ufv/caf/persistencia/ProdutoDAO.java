package br.ufv.caf.persistencia;

import br.ufv.caf.modelo.Produto;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ProdutoDAO {
    private ArrayList<Produto> produtos;

    public ProdutoDAO(){
        produtos = new ArrayList<Produto>();
    }

    public void inserirProduto(Produto p){
        produtos.add(p);
        System.out.println("Produto inserido com sucesso!");
        System.out.println("Total de produtos: "+produtos.size());
    }

    public Produto pesquisa(int codigo){
        for(Produto p : produtos){
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }

    public ArrayList<Produto> listarProdutos(){
        return produtos;
    }
}
