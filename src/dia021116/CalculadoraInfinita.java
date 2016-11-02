package dia021116;

import java.util.Scanner;

public class CalculadoraInfinita {

	public CalculadoraInfinita() {
		// TODO Auto-generated constructor stub
		calcular();
	}
	
	public void calcular(){
		
		int num1;
		int num2;
		int opr ;
		int resoltado = 0;
				
		
			System.out.println("Introduza o primeiro numero");
		num1 = (new Scanner(System.in)).nextInt();
			System.out.println("introduza o segundo numero");
		num2 = (new Scanner(System.in)).nextInt();
		
		if(num2 == 0){
			
			System.out.println("Sair do Programa");
			System.exit(0);
		}
		
		while(num2 != 0){
			
			
			System.out.println("digite a operacao que pertende realizar\n 1 = soma\n 2 = subtracao\n 3 = divisao\n 4 = multiplicacao");
		opr = (new Scanner(System.in)).nextInt();
			
			
		if(opr == 1 ){
			num1 = num1 + num2;
			resoltado = num1;
				System.out.println("a soma dos numeros e " + resoltado);
		}else if(opr == 2){
			num1 = num1 - num2;
			resoltado = num1;
				System.out.println("a diferenca e " + resoltado);
			
		}else if(opr == 3){
			num1 = num1 / num2;
			resoltado = num1;
				System.out.println("o queficiente dos numeros e " + resoltado);
			
		}else if (opr == 4){
			num1 = num1 * num2;
			resoltado = num1;
			
				System.out.println("o produto dos numeros e " + resoltado);
		}else{
				System.out.println("Introduza um numeros valido pff");
		}
		
				System.out.println("Introduza um numero");
					num2 = (new Scanner(System.in)).nextInt();
				}
	
			if(num2 == 0){
			
			System.out.println("Adeus");
			System.exit(0);
		}
		
		
	}
			
}
