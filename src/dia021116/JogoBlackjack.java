package dia021116;

import java.util.Random;

public class JogoBlackjack {

	int vlr = 0;
	final int valormax =13;
	
	public JogoBlackjack() {
		// TODO Auto-generated constructor stub
	       Random r = new Random ();
		   vlr = r.nextInt(valormax);
		   
		   blackjack();
	}

	public void blackjack(){
		
		System.out.println("Bem vindo ao BLACKJACK\n");
		
		System.out.println("Suas cartas:\n " + vlr);
		
	}
}
