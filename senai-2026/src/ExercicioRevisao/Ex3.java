package ExercicioRevisao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double peso = input.nextDouble();
		
		System.out.println("Digite sua altura");
		double altura = input.nextDouble();
		
		double calcImc = peso/(altura*altura);
		
		if(calcImc < 18.5) {
			System.out.println("Magreza");
		}else if(calcImc >= 18.5 && calcImc <= 24.9) {
			System.out.println("Saudável");
		}else if(calcImc >= 25.0 && calcImc <= 34.9) { 
			System.out.println("Sobrepeso");
		}else if(calcImc >= 30.0 && calcImc <= 34.9) {
			System.out.println("Obesidade Grau I");
		}else if(calcImc >= 35.0 && calcImc <=39.9) {
			System.out.println("Obesidade Grau II (severa)");
		}else if(calcImc > 40) {
			System.out.println("Obesidade Grau III (mórbida)");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
