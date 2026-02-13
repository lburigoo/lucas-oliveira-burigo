package aula;

import java.util.Scanner;

public class Ex2 { 
    
    public static void main(String[] args) {
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o preço do primeiro produto");
        double produto1 = input.nextDouble();
        
        System.out.println("Insira o preço do seu segundo produto");
        double produto2 = input.nextDouble();
        
        double SomaProdutos = produto1 + produto2;
        
        
        System.out.println("A soma dos produtos é de R$: "+ SomaProdutos );
        
        
    }

}