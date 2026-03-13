package exercicios;

import java.util.Scanner;

public class Ex5 {

	
	public static void main(String[] args) {
        
        testeP();
        
   
   

}


public static void testeP() {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("escreva a base  ");
    int base = input.nextInt();
    
    System.out.println("escreva 1 numero, o primeiro sera a base  ");
    int codigo2 = input.nextInt();
    
    System.out.println("escreva 1 numero, o primeiro sera a base  ");
    int codigo3 = input.nextInt();
    
    int dif1 = Math.abs(base - codigo2);
    int dif2 = Math.abs(base -codigo3);
    
    System.out.print("O número mais próximo da base (" + base + ") é: ");
    
    if (dif1 < dif2) {
        System.out.println(codigo2);
    } else if (dif2 < dif1) {
        System.out.println(codigo3);
    } else {
}
}
}