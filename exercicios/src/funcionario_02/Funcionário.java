package funcionario_02;

public class Funcionário {

    public static void main(String[] args) {

        FuncionárioPOO f1 = new FuncionárioPOO();

        f1.identificacao = 10;
        f1.nome = "Joao";
        f1.sobrenome = "Silva";
        f1.salMensal = 4000;

        System.out.println("O funcionario de nome: " + f1.nomeCompleto() +
                ", recebe o salario anual de: " + f1.salAnual() +
                ", e o salario final com aumento sera: " + f1.percentualAumento(5));
    }
}