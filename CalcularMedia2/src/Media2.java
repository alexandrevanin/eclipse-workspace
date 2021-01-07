import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Media2 {

		public static void main(String[] args) {
		     					
		int alunos = 3;
        int alunosAprovados = 0, alunosReprovados = 0, alunosAF = 0;
        
        float notasAlunos[] = new float[alunos];
        float notaTotal = 0;
       
        Scanner entrada = new Scanner (System.in);
        
        for (int i = 0; i < alunos; i++) {
            
            System.out.println("----- C�LCULO DA M�DIA SEMESTRAL DE CONTABILIDADE -----");
            System.out.println(" ");
          
            //Entrada das notas do 1� Bimestre
            System.out.println("Informe a nota da prova do aluno no 1� Bimestre: ");
            float nProva1b = entrada.nextFloat();
            System.out.println("Informe a nota do projeto do aluno no 1� Bimestre: ");
            float nProjeto1b = entrada.nextFloat();
            System.out.println("Informe a nota da lista de exerc�cios do aluno no 1� Bimestre: ");
            float nListaExercicio1b = entrada.nextFloat();
            //Entrada das notas do 2� Bimestre
            System.out.println("Informe a nota da prova do aluno no 2� Bimestre: ");
            float nProva2b = entrada.nextFloat();
            System.out.println("Informe a nota do projeto do aluno no 2� Bimestre: ");
            float nProjeto2b = entrada.nextFloat();
            System.out.println("Informe a nota da lista de exerc�cios do aluno no 2� Bimestre: ");
            float nListaExercicio2b = entrada.nextFloat();
            
            //C�lculo das notas do 1� e 2� Bimestre
            float nota1Bimestre = ((nProva1b * 5 + nProjeto1b * 3 + nListaExercicio1b * 2) / 10);
            float nota2Bimestre = ((nProva2b * 5 + nProjeto2b * 3 + nListaExercicio2b * 2) / 10);
            
            //C�lculo da m�dia Semestral
            float mediaSemestral =((nota1Bimestre + nota2Bimestre) / 2);
            
            //Adi��o do valor da m�dia semestral do aluno em uma vari�vel para o calculo da m�dia da turma
            notaTotal += mediaSemestral;
            
            //Adi��o da m�dia semestral do aluno para identifcar a menor e maior nota da turma
            notasAlunos[i] = (float)mediaSemestral;
            
            //Condicional para identificar alunos Aprovados, Repovados e AF
            if (mediaSemestral >= 8){
                alunosAprovados++;
            } else if (mediaSemestral <= 7.9 && mediaSemestral >= 5){
                alunosAF++;
            } else {
                alunosReprovados++;
            }
        } 
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        Arrays.sort(notasAlunos);
        
        //C�lculo da m�dia da classe
        float mediaTurma = notaTotal/alunos;
        
        // Andre 9.0, 9.0, 9.5, 9.5, 9.0, 9.0
        // Marcos 3.0, 2.0, 1.5, 2.5, 2.0, 2.0
        // Jose 6.5, 4.0, 4.5, 6.5, 6.0, 5.0
        
        System.out.println("-------------------------------------------------");
        System.out.println("A m�dia geral da turma �: " + fmt.format(mediaTurma));
        System.out.println("A menor nota da turma �: " + fmt.format(notasAlunos[0]));
        System.out.println("A maior nota da turma �: " + fmt.format(notasAlunos[notasAlunos.length - 1]));
        System.out.println(" ");
        System.out.println("Alunos aprovados: " + alunosAprovados);
        System.out.println("Alunos reprovados: " + alunosReprovados);
        System.out.println("Alunos em Avlia��o Final: " + alunosAF);   
        
    }
}