// criar um programa que permita calcular a média semestral dos alunos.

import java.util.Scanner;

public class Media {

	private static String media;

	public static void main(String[] args) {
		     					
		Scanner sn = new Scanner(System.in);
                
		int nota1, nota2, nota3, nota4;
		int peso;		
		int Media;
		
		System.out.print("Cálculo da média do 1º Bimestre:" + "\n" + "\n");
		
		double media;
				
		System.out.print("Digite a 1ª nota: ");
		    double nota11 = sn.nextDouble();
		System.out.print("Digite o peso da 1ª nota: "); 
		   		int peso1 = sn.nextInt();	
		   		
		System.out.print("Digite a 2ª nota ");
		double nota12 = sn.nextDouble();
		System.out.print("Digite o peso da 2ª nota: "); 
		   		int peso2 = sn.nextInt();

				
		System.out.print("Digite a 3ª nota ");
		double nota13 = sn.nextDouble();
		System.out.print("Digite o peso da 3ª nota: "); 
		   		int peso3 = sn.nextInt();
		
		System.out.print("Digite a 4ª nota ");
		double nota14 = sn.nextDouble();
		System.out.print("Digite o peso da 4ª nota: " ); 
		   		int peso4 = sn.nextInt();
		
		 // calcula a média   		
		   		
		   		media = (double) ((nota11*peso1) + (nota12*peso2) + (nota13*peso3) + (nota14*peso4)) / (peso1+peso2+peso3+peso4);
		System.out.print("A media do aluno no 1º Bimestre " +  " é " + media + "\n" + "\n");
		
	
		// Cálculo da média do 2º Bimestre
		
		System.out.print("Cálculo da média do 2º Bimestre:" + "\n" + "\n");
		
				double media1;
						
				System.out.print("Digite a 1ª nota: ");
				    double nota111 = sn.nextDouble();
				System.out.print("Digite o peso da 1ª nota: "); 
				   		int peso11 = sn.nextInt();	
				   		
				System.out.print("Digite a 2ª nota ");
				double nota121 = sn.nextDouble();
				System.out.print("Digite o peso da 2ª nota: "); 
				   		int peso21 = sn.nextInt();

						
				System.out.print("Digite a 3ª nota ");
				double nota131 = sn.nextDouble();
				System.out.print("Digite o peso da 3ª nota: "); 
				   		int peso31 = sn.nextInt();
				
				System.out.print("Digite a 4ª nota ");
				double nota141 = sn.nextDouble();
				System.out.print("Digite o peso da 4ª nota: "); 
				   		int peso41 = sn.nextInt();
				
				 // calcula a média  		
				   		
				   		media1 = (double) ((nota111*peso11) + (nota121*peso21) + (nota131*peso31) + (nota141*peso41)) / (peso11+peso21+peso31+peso41);
				System.out.print("A media do aluno no 2º Bimestre " +  " é " + media1 + "\n");
				
		
				// Cálculo da média do 3º Bimestre
				
				
				System.out.print("Cálculo da média do 3º Bimestre:" + "\n" + "\n");
				
				double media11;
						
				System.out.print("Digite a 1ª nota: ");
				    double nota1111 = sn.nextDouble();
				System.out.print("Digite o peso da 1ª nota: "); 
				   		int peso111 = sn.nextInt();	
				   		
				System.out.print("Digite a 2ª nota ");
				double nota1211 = sn.nextDouble();
				System.out.print("Digite o peso da 2ª nota: "); 
				   		int peso211 = sn.nextInt();

						
				System.out.print("Digite a 3ª nota ");
				double nota1311 = sn.nextDouble();
				System.out.print("Digite o peso da 3ª nota: "); 
				   		int peso311 = sn.nextInt();
				
				System.out.print("Digite a 4ª nota ");
				double nota1411 = sn.nextDouble();
				System.out.print("Digite o peso da 4ª nota: "); 
				   		int peso411 = sn.nextInt();
				
				 // calcula a média  		
				   		
				   		media11 = (double) ((nota1111*peso111) + (nota1211*peso211) + (nota1311*peso311) + (nota1411*peso411)) / (peso111+peso211+peso311+peso411);
				System.out.print("A media do aluno no 3º Bimestre " +  " é " + media11  + "\n");
		
						
		
		// mostra a média semestral do aluno
		
				double media12 =(media + media1 + media11)/3;
				System.out.print("A media semestral do aluno " +  " é " + media12 + "\n");
				
							
		if ((((media + media1 + media11)/3) < 8)) {
			System.out.print("Reprovado" + "\n");}
		
		else if ((((media + media1 + media11)/3) >= 8)) {
			System.out.print("Aprovado" + "\n");	}
	 
		// nota mínima necessária para a pontuação na prova final
		
		if (((media12) < 8)) {
			System.out.print("Nota mínima na prova final para aprovação: "+  " é " + (10 - media12) + "\n");} 
	}
			
}    