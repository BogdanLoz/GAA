
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello Class!!!");
		
		
		int quotas 		= 300,
			recBaile	= 200,
			recBar 		= 250;
				
		int totalReceitas = quotas + recBaile + recBar;	
			
			System.out.println("Angariou  : " + totalReceitas + "€ ");
			
			
			
			
			int agua = 100,
				luz = 60,
				telefone = 70,
				carro = 150;
	
	
			int totalDespesas = agua + luz + telefone + carro;
			
			System.out.println("Gastou: " + totalDespesas + " € ");
	
	
			int totalProfit = totalReceitas - totalDespesas;
				
			System.out.println("Teve um profit de " + totalProfit + " € , podes comprar um presente :)");
	
	
	
	}
	
	
	

}
