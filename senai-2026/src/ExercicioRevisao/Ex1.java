package ExercicioRevisao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a matrícula do funcionário");
		int matricula = input.nextInt();
		
		System.out.println("Informe o nome do funcionário");
		String nome = input.next();
				
		System.out.println("Informe a quantidade de horas trabalhadas por esse funcionário");
		double horasTrabalhadas = input.nextDouble();
		
		System.out.println("Informe o valor que o funcionário ganha por hora trabalhada");
		double valorHoras = input.nextDouble();
		
		double resultado1 = (horasTrabalhadas * valorHoras)*20;
		
		System.out.println("Funcionário com matrícula " + matricula +", nome do funcionário: " + nome + ", salário final do funcionário: "+ resultado1);
		
		
		
		
		

	}

}
