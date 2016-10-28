package Dia281016;
import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
	
	  	int escondido;
		final int VALORMAX = 10;
		
		
		
		
	public AdivinhaNumero() {
		
		Random r = new Random ();
		
		escondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
		
		}

	public void tentarAdivinhar(){
		
		int num;
		int  i = 0;
		
		System.out.println("Adivinhe o numero aleatorio (Tem 3 tentativas): ");
		
		 num = (new Scanner(System.in)).nextInt();
		
		
		for(i = 0; i < 3; i++){
				
				if(i < 3){
		
			do{
			
			
					if(num > escondido){
			
			System.out.println("O seu numero e maior do que o aleatorio");
			
			
		}else{
			
			System.out.println("O numero e menor do que o aleatorio ");
			}
			
			
			
			System.out.println("Tente outra vez: ");
			num = (new Scanner(System.in)).nextInt();
			
			
		}while(num != escondido);
		
					
					
					
					
					
				}else{
					
					System.out.println("PERDEU");
					
				}
				
			
			
			
		
			
			
		
		
		
		}
		
		
		System.out.println("Acertou!!!");
			
		
		
	}
	
}
