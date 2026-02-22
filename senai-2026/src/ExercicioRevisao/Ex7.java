package ExercicioRevisao;

public class Ex7 {


	    public static void main(String[] args) {
	        
	    	        
	    	int[] numeros = {42, 17, 89, 3, 56};
	    	        
	    	        
	         int maior = numeros[0];
	    	 int menor = numeros[0];
	    	 double soma = 0;
	    	        
	    	       
	    	  for (int num : numeros) {
	    	   if (num > maior) {
	    	        maior = num;
	    	 }
	    	   if (num < menor) {
	    	       menor = num;
	     }
	    	   soma += num;
	    	        }
	    	        
	    	        
	    	  double media = soma / numeros.length;
	    	        
	    	        
	    	  System.out.println("Array: ");
	    	  for (int n : numeros) {
	    	       System.out.print(n + " ");
	    	 }
	    	   System.out.println("\n");
	    	        
	    	   System.out.println("a) Maior elemento: " + maior);
	    	   System.out.println("b) Menor elemento: " + menor);
	    	   System.out.printf("c) Média dos elementos: %.2f%n", media);
	    	    }
	    	}