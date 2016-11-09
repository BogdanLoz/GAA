package Dia091116;

import java.util.Scanner;

public class Desafios {

	public Desafios() {
		// TODO Auto-generated constructor stub
		
	}
	
	/*Dificuldade I
	 *  Desenhe uma piramide de numeros comforme a quantidade de linhas escolhida pelo utilisador 
	 */
	public void exercicio1(){

		/*
		 * Utilize estruturas de repeticao 
		 */
		int linhas,a;
		
		System.out.println("Introduza a quantidade de linhas:\n ");
		linhas = new Scanner(System.in).nextInt();
		
		for(int b = 0; b <=linhas;b++){
			
			for(a = 0;a <=b;a++){
				System.out.print(linhas +"\t" + b);
			}
			System.out.println("\n");
		}
	}

	/*Dificuldade II
	 * Determinar a quantidade de rapazes e raparigas de uma Faculdade mediante a sua altura(> 175 cm e < 175 cm baseada numa lista de 10 alunos
	 */
	public void exercicio2() {
		/*
		 * 
		 *  Perguntar a dez pessoas o seu sexo e a sua altura
		 *  Apresentar na resposta o numero de alunos do sexo masculino e feminino com altura superior a 175,igua a 175 e inferior a 175 
		 *  Utilize um ciclo e uma condicoes
		 */
		int alunos = 0,sexo,altura,masM = 0,masm = 0,femm = 0,femM = 0,mase = 0,feme = 0;
		while(alunos < 10){
			
			System.out.println("Sexo:\n[1]M\n[2]F");
				sexo = new Scanner(System.in).nextInt();
			System.out.println("Introduza a sua altura em centimetros:\n");
				altura = new Scanner(System.in).nextInt();
				
				if(sexo == 1 && altura < 175){
					masm = masm + 1;
				}
				else if(sexo == 1 && altura > 175){
					masM = masM + 1;
				}else if(sexo == 2 && altura < 175){
					femm = femm + 1;
					}else if(sexo == 2 && altura > 175){
						femM = femM + 1;
					}else if (sexo == 1 && altura == 175){
						mase = mase + 1;
					}else if (sexo == 2 && altura == 175){
						feme = feme + 1;
					}
				
				alunos++;
				}
		
			System.out.println("Existem " + masm + " Homens com altura inferior a 175 cm ");
			System.out.println("Existem " + masM + " Homens com altura superior a 175 cm ");
			System.out.println("Existem " + femm + " Mulheres com altura inferior a 175 cm ");
			System.out.println("Existem " + femM + " Mulheres com altura superior a 175 cm ");
			System.out.println("Existem " + mase + " Mulheres com altura igual a 175 cm ");
			System.out.println("Existem " + feme + " Mulheres com altura igual a 175 cm ");
			
	}
	
	
	/*Dificuldade III
	 * Analisar as notas de uma turma,exibir a media e os nomes dos aluno com uma nota superior a da media
	 * 	 */
	public void exercicio3(){
		/*
		 * Criar 2 Arrays, um para nomes outro para as notas
		 * Utilizar um ciclo for para guardar 5 nomes e 5 notas de 5 alunos
		 * Fazer a media das notas introduzidas
		 * Utilizar um ciclo for para verificar e exibir o nome dos alunos com uma nota superior a da media
		 */
		
		
        String[] nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0;
        double media;
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Introduza o nome do aluno nº "+(i+1));
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Introduza a nota do aluno nº "+(i+1));
            notas[i] = new Scanner(System.in).nextDouble();
            soma = soma + notas[i];
        }
        media = soma / 5;
        System.out.println("A média dos alunos é: "+ media);
        System.out.println();
        System.out.println("Lista dos alunos cuja nota é superior a média da turma");
        for(int i = 0; i < 5; i++) {
            if(notas[i] > media)
                System.out.println(nomes[i]);    
        }
		
	}
}

