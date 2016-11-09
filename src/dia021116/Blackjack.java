package casa.Trabalho_jogo;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {
	 
	
	
	public Blackjack() {
		
		int opc;
		int totalpontos;
		int totalpontosD;
		int cartaNova;
		int cartaNova2;
		int cartaNova3;
		int cartaDNova;
		int cartaDNova2;
		cartaNova = cartas();
		cartaNova2 = cartas();
		cartaNova3 = cartas();
		cartaDNova = cartasDealer();
		cartaDNova2 = cartasDealer();
		
			System.out.println("        As suas duas primeiras cartas sao: " + cartaNova + " e " + cartaNova2);
			totalpontos = cartaNova + cartaNova2; 
			System.out.println("        Tem um total de " + totalpontos + " pontos");
			System.out.println("\n        A primeira carta do Dealer e: " + cartaDNova + " e " + cartaDNova2 );
			totalpontosD = cartaDNova + cartaDNova2;
			System.out.println("        O Dealer tem um total de " + totalpontosD + " pontos");
			
			
			while(totalpontos <21 && totalpontosD<21){
				
			System.out.println("\nDeseja pedir mais uma carta\n1 -> Sim\n2 -> Nao");
		    opc = (new Scanner(System.in)).nextInt();
		    
		    if(opc == 1){
		    	System.out.println("Tirou a carta com o valor de: " + cartaNova3);
		    	totalpontos = totalpontos + cartaNova3;
		    	System.out.println("Tem agora um total de " + totalpontos);
		    	if (totalpontos > 21){
		    		System.out.println("Voce perdeu ");
		    		System.exit(0);
		    	}
		    	else if (totalpontos == 21){
		    		System.out.println("Voce ganhou");
		    		System.exit(0);
		    	}
		       }else if(opc == 2){
		    	while(totalpontos <= 21 && totalpontosD <= 21 ){
		    	if(totalpontosD > totalpontos ){
		    		
		    		System.out.println("Voce Perdeu");
		    		System.exit(0);
		    	
		    	}else{
		    		System.out.println("Voce Ganhou");
		    		System.exit(0);
		    	}
		    	
		    	}
		    }
			}
			if(totalpontosD > totalpontos ){
	    		
	    		System.out.println("Voce Perdeu");
	    		System.exit(0);
	    	
	    	}else{
	    		System.out.println("Voce Ganhou");
	    		System.exit(0);
	    	}
	}
	
	public int cartas(){
	
		int carta;
		
		Random r = new Random();
		carta = r.nextInt(12);
		
		if(carta == 0){
			carta = 2;
			}
		else if(carta == 1){
			carta = 3;
			}
		else if(carta == 2){
			carta = 4;
			}
		else if(carta == 3){
			carta = 5;
			}
		else if(carta == 4){
			carta = 6;
			}
		else if(carta == 5){
			carta = 7;
			}
		else if(carta == 6){
			carta =  8;
			}
		else if(carta == 7){
			carta = 9;
			}
		else if(carta == 8){
			carta = 10;
			}
		else if(carta == 9){
			carta = 10;
			}
		else if(carta == 10){
			carta = 10;
			}
		else if(carta == 11){
			carta =  10;
			}
		else{
			carta =  11;
		}
		return carta;
		
		
	}
	
	public int cartasDealer(){
		int carta;
		
		Random r = new Random();
		carta = r.nextInt(12);
		
		if(carta == 0){
			carta = 11;
			
			}
		else if(carta == 1){
			carta = 2;
			
			}
		else if(carta == 2){
			carta = 3;
			
		}
		else if(carta == 3){
			carta =  4;
			
		}
		else if(carta == 4){
			carta = 5;
			
		}
		else if(carta == 5){
			carta = 6;
			
		}
		else if(carta == 6){
			carta = 7;
			
		}
		else if(carta == 7){
			carta = 8;
			
		}
		else if(carta == 8){
			carta = 9;
			
		}
		else if(carta == 9){
			carta = 10;
			
		}
		else if(carta == 10){
			carta = 10;
			
		}
		else if(carta == 11){
			carta = 10;
			
		}
		else{
			carta =10;
			
		}
		
		return carta;
	}
}
