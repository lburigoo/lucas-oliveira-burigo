package funcionário;

public class Funcionario {

	public static void main(String[] args) {
		
		FuncionarioPOO f1 = new FuncionarioPOO();
		
		f1.identificacao = 10;
		f1.nome = "João";
		f1.sobrenome = "Silva";
		f1.salMensal = 1000;
		
		System.out.println(f1.SalAnual(f1.salMensal)); 
	}
}
