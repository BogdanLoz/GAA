package dia021116;

public class Ciclos {

	public Ciclos() {
		// TODO Auto-generated constructor stub
		de_para();
	}
	
	public void enquanto(){
		
		int i = 1;
		String msg = "All you need is love";
		
		
	System.out.println("Love is all you need");
	}
	

	public void fazerEnquanto(){
		int i = 2;
		String msg = "All you need is love";
		
		
		do{
			System.out.println(msg);
			i++;
		   }while (i <= 4);
		
			System.out.println("Love is all you need");
		}
	
	
	public void de_para(){
		
		for(int i = 1; i < 4; i++){
			System.out.println("All you need is Love");
			}
		
		    System.out.println("Love is all you need");
	}
	
	
}
