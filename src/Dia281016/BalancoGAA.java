package Dia281016;

import java.util.Scanner;

public class BalancoGAA {
		
	
	
	
	
		int balanco;
		int totalrec;
		int totaldesp;
	
		
		
	public BalancoGAA() {
		

		
		System.out.println("Bom dia!");
		
		calcularReceitas();
		
		
		calcularDespesas();
		
		
		calcularBalanco();
		
		if(balanco > 0){
			
			System.out.println("O balanco é positivo");
		}else if(balanco == 0){
			
			System.out.println("O balanco e neutro");
			
		}else{
			
			System.out.println("O balanco e negativo");
		}
		
		
		
	}
		public int calcularReceitas(){
			
		int rec1;
		int rec2;
		int rec3;
		
			
		System.out.println("Introduza as receitas: ");
		
		
		System.out.println("Quotas: ");
		rec1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Baile: ");
		rec2 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Bar: ");
		rec3 = (new Scanner(System.in)).nextInt(); 
		
		totalrec = rec1 + rec2 + rec3;
		
		System.out.println("Teve o total de " + totalrec + " de receitas\n");
		
		return totalrec;
		}
		
		
		public int calcularDespesas(){
			
		int desp1;
		int desp2;
		int desp3;
		
			
			
		System.out.println("Introduza as despesas: ");
		
		System.out.println("Luz: ");
		desp1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Agua: ");
		desp2 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Telefone: ");
		desp3 = (new Scanner(System.in)).nextInt();
	
		totaldesp = desp1 + desp2 + desp3;
		
		return totaldesp;	
		}
		//visibilidade/tipo/nome/parametro
		public int calcularBalanco(){
			
			System.out.println("Gastou um total de " + totaldesp + "€");
			balanco = totalrec - totaldesp;
			
			System.out.println("Teve um lucro de " + balanco + "€");
			
			return balanco;
		}
		
		
	
	
		
		
		
		
	
	

}
