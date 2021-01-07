package teste;

public class teste	 {
	private static int linha;
	
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] vetor = new int[5];
		//Leitura de dados
		for (int i = 0; i < 5; i++) {
		System.out.println("Digite:");
		vetor[i] = sc.nextInt();
		}
		//Escrita de dados
		for (int i = 0; i < 5; i++) {
		System.out.println(vetor[i]);
		}
		}
		}

// int[][] vetor2 = {{3, 2, 6}, {1, 2, 5}};