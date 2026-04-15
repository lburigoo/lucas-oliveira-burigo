package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		
		List<Double> numero = new ArrayList<>();
		
	
		
		System.out.println("Digite");
		
		double valor;
		
		do {
			valor = input.nextDouble();
			
			if(valor != 0) {
				numero.add(valor);
			}
		} while(valor != 0);
		
		double menor = numero.get (0);
		double maior = numero.get(0);
		
	}
}
