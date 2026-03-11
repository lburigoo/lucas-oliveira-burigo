package pessoas;

public class Pessoas {

	public static void main(String[] args) {
		
		PessoasPOO p1 = new PessoasPOO();
		
		p1.nome = "Lucas";
		p1.sexo = 'M';
		p1.dataNascimento = "01/02/2008";
		p1.estadoCivil = "Solteiro";
		
		System.out.println("O seu nome é: " + p1.nome);
		
		PessoasPOO p2 = new PessoasPOO();

		p2.nome = "Vitor";
		p2.sexo = 'M';
		p2.dataNascimento = "00/00/00";
		p2.estadoCivil = "Sei lá";
		
		System.out.println("O seu nome é: "+ p2.nome);
		
	}

}
