package Dia281016;

import java.util.Scanner;

public class CalculadoraBasica {

	public CalculadoraBasica() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Bom dia!\n");
		
		int num1;
		int num2;
		int sum;
		int sub;
		int mul;
		double div;
		
		
		System.out.println("Introduza o primeiro numero: ");
		
		num1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Introduza o segundo numero:");
		
        num2 = (new Scanner(System.in)).nextInt();	
        
        sum = num1 + num2;
        
        
        
	    System.out.println("A soma dos numeros e: " + sum);
	
	
	
	}
	
	
	
	
	

}
