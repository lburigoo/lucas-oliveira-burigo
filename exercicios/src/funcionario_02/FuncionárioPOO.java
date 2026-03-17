package funcionario_02;

public class FuncionárioPOO {

    int identificacao;
    String nome;
    String sobrenome;
    double salMensal;

    public double percentualAumento(double aumentoPercentual) {

        double aumento = salMensal * aumentoPercentual / 100;
        salMensal += aumento;

        return salMensal;
    }

    public String nomeCompleto() {

        return nome + " " + sobrenome;
    }

    public double salAnual() {

        return salMensal * 12;
    }
}