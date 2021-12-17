package com.company;

public class FolhaPagamento {

    public static class Funcionario{

        private String nome, dataNascimento, tipodeContrato, datadeAdmissao;
        private double valordeSalario;
        private int numerodeFilhos;

        public Funcionario(String nome, String nascimento){
            this.nome = nome;
            this.dataNascimento = nascimento;
        }

        public void Contratar(String TipoContrato, double salario, int filhos, String DataAdmissao){
            this.tipodeContrato = TipoContrato;
            this.valordeSalario = salario;
            this.numerodeFilhos = filhos;
            this.datadeAdmissao = DataAdmissao;
        }
        public String getNome(){
            return this.nome;
        }

        public String getDatadeNascimento(){
            return this.dataNascimento;
        }

        public String getTipoDeContrato(){
            return this.tipodeContrato;
        }

        public double getValordeSalario(){
            return this.valordeSalario;
        }

        public int getNumerodeFilhos(){
            return this.numerodeFilhos;
        }

        public String getDataAdmisao(){
            return this.datadeAdmissao;
        }

        public void setTipoDeContrato(String TipoDeContrato){
            this.tipodeContrato = TipoDeContrato;
        }

        public void setValordeSalario(double Salario){
            this.valordeSalario = Salario;
        }

        public void setNumerodeFilhos(int NumerodeFilhos){
            this.numerodeFilhos = NumerodeFilhos;
        }

        public void setDataAdmissao(String dataAdmissao){
            this.datadeAdmissao = dataAdmissao;
        }

        public double CalculoSalarioBruto(int horasTrabalhadas){
            if("Horista".equals(this.tipodeContrato)){
                return this.valordeSalario * horasTrabalhadas;
            }else if("Efetivo".equals(this.tipodeContrato)){
                return this.valordeSalario;
            }
            return 0;
        }

        public double DescontoINSS(int horasTrabalhadas){
            double salarioBruto = CalculoSalarioBruto(horasTrabalhadas);
            if(salarioBruto <= 1659.38){
                return (salarioBruto *0.08);
            }else if(salarioBruto > 1659.38 && salarioBruto <= 2765.67) {
                return (salarioBruto * 0.09);
            }else if(salarioBruto > 2765.67 && salarioBruto <= 5531.31){
                return (salarioBruto * 0.11);
            }else if(salarioBruto > 5531.31){
                return (5531.31 * 0.11);
            }else{
                return  -1;
            }
        }

        public double ImpostodeRenda(int horasTrabalhadas){
            double SalarioBruto = CalculoSalarioBruto(horasTrabalhadas);
            if(SalarioBruto <= 1903.98){
                return 0;
            }else if (SalarioBruto>= 1903.99 && SalarioBruto <= 2826.65){
                return (double)(SalarioBruto * 0.075) - 142.80;
            }
            else if(SalarioBruto >= 2826.66 && SalarioBruto<= 3751.05){
                return (double)(SalarioBruto *0.15) - 354.80;
            }
            else if(SalarioBruto>= 3751.06 && SalarioBruto <= 4664.68){
                return (double)(SalarioBruto * 0.225) - 636.13;
            }
            else if(SalarioBruto >= 4664.68){
                return (double) (SalarioBruto * 0.275) - 869.36;
            }
            return -1;
        }
        public double isSalarioLiquido(int horasTrabalhadas){
            return this.CalculoSalarioBruto(horasTrabalhadas) - this.DescontoINSS(horasTrabalhadas) - this.ImpostodeRenda(horasTrabalhadas);
        }
        public void FolhadePagamento(int horasTrabalhadas){
            System.out.println("*********** Folha de pagamento ***********");
            System.out.println("Nome:"+this.getNome());
            System.out.println("Idade:"+this.getDatadeNascimento());
            System.out.println("Data admissão:"+this.getDataAdmisao());
            System.out.println("Tipo de Contrato:"+this.getTipoDeContrato());
            System.out.println("Salário Bruto:"+this.CalculoSalarioBruto(horasTrabalhadas));
            System.out.println("Número de filhos:"+this.getNumerodeFilhos());
            System.out.println("Desconto INSS:"+this.DescontoINSS(horasTrabalhadas));
            System.out.println("Desconto Imposto de Renda:"+this.ImpostodeRenda(horasTrabalhadas));
            System.out.println("Salário líquido:"+this.isSalarioLiquido(horasTrabalhadas));
        }


    }

}

