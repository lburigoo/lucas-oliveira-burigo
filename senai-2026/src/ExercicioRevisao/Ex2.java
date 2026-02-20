package ExercicioRevisao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do vendedor");
		String vendedor = input.next();
		
		System.out.println("Digite o salário fixo de " + vendedor);
		double salFixo = input.nextDouble();
		
		System.out.println("Digite o valor total das vendas relizadas por " + vendedor);
		double totalVendas = input.nextDouble();
		
		double salTotal = (totalVendas * 15)/100;
		double salTotal2 = salTotal + salFixo;
		
		System.out.println("O salário final do vendedor " + vendedor + " será de: R$" + salTotal2);
	}
}
