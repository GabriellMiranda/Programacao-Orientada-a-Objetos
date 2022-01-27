package br.ufv.caf.visao;

import br.ufv.caf.controle.ControleProduto;
import br.ufv.caf.modelo.Produto;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaProduto {

    private Scanner s;
    private ControleProduto controleProduto;

    public TelaProduto() {
        s = new Scanner(System.in);
        controleProduto = new ControleProduto();
    }

    public void telaInicial(){
        int opcao;
        while (true){
            mostrarMenu();
            opcao = s.nextInt();
            switch(opcao){
                case 1:
                    telaInserir();
                    break;
                case 2:
                    telaListar();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Erro, opção invalida!!");
            }
        }
    }

    private void telaInserir(){
        System.out.println("Digite o código e o nome do produto");
        int codigo = s.nextInt();
        String nome = s.nextLine();
        controleProduto.inserirProduto(codigo, nome);

    }

    private void telaListar(){
        ArrayList<String> produtos = controleProduto.listarProdutos();

        for(String S: produtos){
            System.out.println(S);
        }
    }


    private void mostrarMenu(){
            System.out.println("Digite: ");
            System.out.println("1: inserir produto");
            System.out.println("2: listar");
            System.out.println("3: sair");
    }

}
