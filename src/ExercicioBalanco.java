
public class ExercicioBalanco {
	
	
	int totalReceitas;
	int totalDespesas;

	public ExercicioBalanco() {
		// TODO Auto-generated constructor stub
		
		
		System.out.println("Hello Class!!!");
		
			
		
		//Calcular receitas.	
		
			calcularReceitas();
		
	
			//Calcular Despesas
			
			calcularDespesas();
		
			
	
	
			//Calcular o profit.
			
			int calcularProfit = totalReceitas - totalDespesas;
			
			System.out.println("Teve um profit de " + calcularProfit + " € , podes comprar um presente :)");
		
	
	}
	
	
	public void calcularReceitas(){
		
		    int quotas 		= 300,
				recBaile	= 200,
				recBar 		= 250;
					
			totalReceitas = quotas + recBaile + recBar;	
				
			System.out.println("Angariou  : " + totalReceitas + "€ ");
			
			}
	
	
	
	public void calcularDespesas(){
		
		//Calcular despesas.
		   
		
		   int agua      = 100,
				luz      = 60,
				telefone = 70,
				carro    = 150;
	
			
			
	
			 totalDespesas = agua + luz + telefone + carro;
			
			System.out.println("Gastou: " + totalDespesas + " € ");
		
		
	}
	
	
	

	
		
		}



