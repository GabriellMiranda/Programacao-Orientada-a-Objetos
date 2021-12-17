package com.company;

public class Main {

    public static void main(String[] args) {
        //Gabriel
        FolhaPagamento.Funcionario Funcionario1 = new FolhaPagamento.Funcionario("Gabriel Miranda", "09/06/1990");
        FolhaPagamento.Funcionario Funcionario2 = new FolhaPagamento.Funcionario("Érike Augusto", "02/12/2000");
        Funcionario1.Contratar("Efetivo", 5000, 2, "04/12/2021");
        Funcionario2.Contratar("Horista", 5000, 2, "01/12/2021");
        Funcionario1.FolhadePagamento(0);
        System.out.println();
        Funcionario2.FolhadePagamento(50);
    }

}

