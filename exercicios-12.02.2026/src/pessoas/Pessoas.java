package pessoas;

public class Pessoas {

	public static void main(String[] args) {
		
		PessoasPOO p1 = new PessoasPOO();
		
		p1.nome = "Lucas";
		p1.sexo = "Masculino";
		p1.dataNascimento = "01/02/2008";
		p1.estadoCivil = "Solteiro";
		
		PessoasPOO p2 = new PessoasPOO();

		p2.nome = "Vitor";
		p2.sexo = "Masculino";
		p2.dataNascimento = "00/00/00";
		p2.estadoCivil = "Sei lá";
		
		System.out.println("Pessoa1 " + p1 + " Pessoa2 " + p2);
	}

}
