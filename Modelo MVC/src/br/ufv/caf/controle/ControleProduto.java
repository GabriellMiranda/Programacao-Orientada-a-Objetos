package br.ufv.caf.controle;

import br.ufv.caf.modelo.Produto;
import br.ufv.caf.persistencia.ProdutoDAO;

import java.util.ArrayList;

public class ControleProduto {

    private ProdutoDAO produtoDAO;

    public ControleProduto(){
        produtoDAO = new ProdutoDAO();
    }

    public void inserirProduto(int codigo, String nome){
        Produto p = new Produto(nome, codigo);
        System.out.println(p);

        Produto pExistente = produtoDAO.pesquisa(codigo);
        if(pExistente != null){
            System.out.println("Produto com códogo:"+ codigo+",Já existe!");
        }else{
            produtoDAO.inserirProduto(p);
        }
    }

    public ArrayList<String> listarProdutos(){
        ArrayList<String> produtosStr = new ArrayList<String>();
        ArrayList<Produto> produtos = produtoDAO.listarProdutos();
        for(Produto p: produtos){
            produtosStr.add(p.toString());
        }
        return produtosStr;
    }
}
