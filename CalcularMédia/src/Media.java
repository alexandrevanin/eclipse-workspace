// criar um programa que permita calcular a m�dia semestral dos alunos.

import java.util.Scanner;

public class Media {

	private static String media;

	public static void main(String[] args) {
		     					
		Scanner sn = new Scanner(System.in);
                
		int nota1, nota2, nota3, nota4;
		int peso;		
		int Media;
		
		System.out.print("C�lculo da m�dia do 1� Bimestre:" + "\n" + "\n");
		
		double media;
				
		System.out.print("Digite a 1� nota: ");
		    double nota11 = sn.nextDouble();
		System.out.print("Digite o peso da 1� nota: "); 
		   		int peso1 = sn.nextInt();	
		   		
		System.out.print("Digite a 2� nota ");
		double nota12 = sn.nextDouble();
		System.out.print("Digite o peso da 2� nota: "); 
		   		int peso2 = sn.nextInt();

				
		System.out.print("Digite a 3� nota ");
		double nota13 = sn.nextDouble();
		System.out.print("Digite o peso da 3� nota: "); 
		   		int peso3 = sn.nextInt();
		
		System.out.print("Digite a 4� nota ");
		double nota14 = sn.nextDouble();
		System.out.print("Digite o peso da 4� nota: " ); 
		   		int peso4 = sn.nextInt();
		
		 // calcula a m�dia   		
		   		
		   		media = (double) ((nota11*peso1) + (nota12*peso2) + (nota13*peso3) + (nota14*peso4)) / (peso1+peso2+peso3+peso4);
		System.out.print("A media do aluno no 1� Bimestre " +  " � " + media + "\n" + "\n");
		
	
		// C�lculo da m�dia do 2� Bimestre
		
		System.out.print("C�lculo da m�dia do 2� Bimestre:" + "\n" + "\n");
		
				double media1;
						
				System.out.print("Digite a 1� nota: ");
				    double nota111 = sn.nextDouble();
				System.out.print("Digite o peso da 1� nota: "); 
				   		int peso11 = sn.nextInt();	
				   		
				System.out.print("Digite a 2� nota ");
				double nota121 = sn.nextDouble();
				System.out.print("Digite o peso da 2� nota: "); 
				   		int peso21 = sn.nextInt();

						
				System.out.print("Digite a 3� nota ");
				double nota131 = sn.nextDouble();
				System.out.print("Digite o peso da 3� nota: "); 
				   		int peso31 = sn.nextInt();
				
				System.out.print("Digite a 4� nota ");
				double nota141 = sn.nextDouble();
				System.out.print("Digite o peso da 4� nota: "); 
				   		int peso41 = sn.nextInt();
				
				 // calcula a m�dia  		
				   		
				   		media1 = (double) ((nota111*peso11) + (nota121*peso21) + (nota131*peso31) + (nota141*peso41)) / (peso11+peso21+peso31+peso41);
				System.out.print("A media do aluno no 2� Bimestre " +  " � " + media1 + "\n");
				
		
				// C�lculo da m�dia do 3� Bimestre
				
				
				System.out.print("C�lculo da m�dia do 3� Bimestre:" + "\n" + "\n");
				
				double media11;
						
				System.out.print("Digite a 1� nota: ");
				    double nota1111 = sn.nextDouble();
				System.out.print("Digite o peso da 1� nota: "); 
				   		int peso111 = sn.nextInt();	
				   		
				System.out.print("Digite a 2� nota ");
				double nota1211 = sn.nextDouble();
				System.out.print("Digite o peso da 2� nota: "); 
				   		int peso211 = sn.nextInt();

						
				System.out.print("Digite a 3� nota ");
				double nota1311 = sn.nextDouble();
				System.out.print("Digite o peso da 3� nota: "); 
				   		int peso311 = sn.nextInt();
				
				System.out.print("Digite a 4� nota ");
				double nota1411 = sn.nextDouble();
				System.out.print("Digite o peso da 4� nota: "); 
				   		int peso411 = sn.nextInt();
				
				 // calcula a m�dia  		
				   		
				   		media11 = (double) ((nota1111*peso111) + (nota1211*peso211) + (nota1311*peso311) + (nota1411*peso411)) / (peso111+peso211+peso311+peso411);
				System.out.print("A media do aluno no 3� Bimestre " +  " � " + media11  + "\n");
		
						
		
		// mostra a m�dia semestral do aluno
		
				double media12 =(media + media1 + media11)/3;
				System.out.print("A media semestral do aluno " +  " � " + media12 + "\n");
				
							
		if ((((media + media1 + media11)/3) < 8)) {
			System.out.print("Reprovado" + "\n");}
		
		else if ((((media + media1 + media11)/3) >= 8)) {
			System.out.print("Aprovado" + "\n");	}
	 
		// nota m�nima necess�ria para a pontua��o na prova final
		
		if (((media12) < 8)) {
			System.out.print("Nota m�nima na prova final para aprova��o: "+  " � " + (10 - media12) + "\n");} 
	}
			
}    