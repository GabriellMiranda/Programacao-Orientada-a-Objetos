/*
 *11. Leia de um arquivo* a relação de pacientes de uma clínica, cada um com o
nome, o sexo, o peso, a idade e a altura. Escolha o formato do arquivo que
achar mais adequado. Exiba um relatório contendo:
i. a quantidade de pacientes.
ii. a média de idade dos homens.
iii. número de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
iv. a quantidade de pessoas com idade entre 18 e 25.
v. o nome do paciente mais velho e o nome da mulher mais baixa.
* pesquise sobre a leitura de arquivos em Java
 */
package listaexercicios01;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author gabri
 */

//C:\Users\gabri\OneDrive\Documentos\Disciplinas\POO\ListaExercicios01\src\listaexercicios01\arquivo
public class Exercicio11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] linhaArq;
        System.out.print("Digite o nome do arquivo:");
        String nomeArq = scan.nextLine();
        int pacientes = 0, qtd_masculino = 0, mulheresExcecao = 0, idade, contIdade = 0, maior = 0, idadehomens = 0;
        String nomeMaisVelho = " ", mulherMaisBaixa = " ";
        float baixa = 0;
        float alturaPacientes, pesoPacientes; 
        
        try {
            FileReader file = new FileReader(nomeArq);//Abrindo arquivo
            BufferedReader lerArq = new BufferedReader(file);
            String linha = lerArq.readLine();//lendo a primeira
            while(linha != null){
                pacientes = pacientes + 1;
                linhaArq = linha.split(" ");
                idade = Integer.parseInt(linhaArq[3]);
                pesoPacientes = Float.parseFloat(linhaArq[2]);
                alturaPacientes = Float.parseFloat(linhaArq[4]);
                
                if(linhaArq[1].equals("masculino")){
                    qtd_masculino = qtd_masculino + 1;
                    idadehomens += idade;
                }
                if(linhaArq[1].equals("feminino") && alturaPacientes <= 1.7 && alturaPacientes>= 1.6 && pesoPacientes>70){
                    mulheresExcecao = mulheresExcecao + 1;
                }
                if(idade >= 18 && idade <= 25){
                    contIdade+=1;
                }
                if(maior < idade){
                    maior = idade;
                    nomeMaisVelho = linhaArq[0];
                }
                if(linhaArq[1].equals("feminina") && baixa < alturaPacientes){
                    baixa = alturaPacientes;
                    mulherMaisBaixa = linhaArq[0]; 
                }
                linha = lerArq.readLine();
            }
            file.close();
        }catch(IOException e){
            System.err.printf("Erro na abertura do arquivo:%s",e.getMessage());
        }
        System.out.println("A quantidade de pacientes:"+pacientes);
        System.out.println("A media de idade dos homens:"+idadehomens/qtd_masculino);
        System.out.println("número de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg:"+mulheresExcecao);
        System.out.println("a quantidade de pessoas com idade entre 18 e 25:"+contIdade);
        System.out.println("o nome do paciente mais velho:"+nomeMaisVelho);
        System.out.println("nome da mulher mais baixa:"+mulherMaisBaixa);
        
     }
}
