package dia021116;

public class Condicionais {

	public Condicionais() {
		// TODO Auto-generated constructor stub
		//comparadorSimples();
		comparadorMultiVariavel();
		}

				//sempre com letra minuscla.
	public void comparadorSimples(){
		
		int num1 = 4;
		int num2 = 3;
		
		
		/*
		 * = -> Atribuicao
		 * == -> Comparacao (true || false)
		 * < -> Comparacao
		 * > -> Comparacao
		 * != -> Comparacao
		 */
		if (num1 == num2){
			System.out.println("Os numeros sao iguais");
			}else if (num1 < num2){
				System.out.println("O numero 1 e menor do que o numero 2");
				}else{
					System.out.println("O numero 1 e maior do que o numero 2");
				}
			}
	
	public void comparadorMultiVariavel(){
		int num1 = 10,
			num2 = 5,
			num3 = 4,
			num4 = 3;
		
		if (num1 > num2 && num1 > num3 && num1 > num4){
				System.out.println("O numero 1 e o maior de todos");
			}else if (num2 > num1 && num2 > num3 && num2 > num4){
				System.out.println("o numero2 e o maior de todos");
			}else if (num3 > num1 && num3> num2 && num3 > num4){
				System.out.println("o numero 3 e o maior de todos");
			}else if (num4 > num1 && num4 > num2 && num4 > num3){
				System.out.println("o numero4 e o maior de todos");
			}else{
				System.out.println("Os numeros sao iguais");
			}
		
		if(num2 > num3 || num1 > num4){
				System.out.println("ganha a equipa 2");
			}else{
				System.out.println("ganha a equipa 1");
			}
		
		
	}
	
}
