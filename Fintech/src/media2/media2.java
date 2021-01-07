package media2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Institui��o: HSM University
 * Diciplina: L�gica de Programa��o e Orienta��o a Objetos
 * Aluno: Andr� Alves de Oliveira
 * @author aavls
 */
public class media2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        float valorBolsa = 0;
        
        //Vetores respons�veis por armazenar os valores das a��es na bolsa
        ArrayList<Float> vbSemana1 = new ArrayList<Float>();
        ArrayList<Float> vbSemana2 = new ArrayList<Float>();
        ArrayList<Float> vbSemana3 = new ArrayList<Float>();
        ArrayList<Float> vbSemana4 = new ArrayList<Float>();
        ArrayList<Float> mediaDasSemanas = new ArrayList<Float>();
        
        //Variaveis respons�veis por armazenar a m�dia da bolsa em cada semana
        float mediaSemana1 = 0, mediaSemana2 = 0, 
              mediaSemana3 = 0, mediaSemana4 = 0;
                        
        //La�o de repeti��o�para entrada dos valores
        for(int i = 0; i < 28; i++) {
            if(i <= 6){
                System.out.println("Dia " + (i+1) + " - " + " Informe o valor da a��o na bolsa: ");
                System.out.print("R$ ");
                valorBolsa = leitor.nextFloat();
                vbSemana1.add(valorBolsa);
                System.out.println("----------------------------------------");
                System.out.println(" ");                            
            }
            else if(i >= 7 && i <= 13){
                System.out.println("Dia " + (i+1) + " - " + " Informe o valor da a��o na bolsa: ");
                System.out.print("R$ ");
                valorBolsa = leitor.nextFloat();
                vbSemana2.add(valorBolsa);
                System.out.println("----------------------------------------");
                System.out.println(" ");                            
            }
            else if(i >= 14 && i <= 20){
                System.out.println("Dia " + (i+1) + " - " + " Informe o valor da a��o na bolsa: ");
                System.out.print("R$ ");
                valorBolsa = leitor.nextFloat();
                vbSemana3.add(valorBolsa);
                System.out.println("----------------------------------------");
                System.out.println(" ");                            
            }
            else {
                System.out.println("Dia " + (i+1) + " - " + " Informe o valor da a��o na bolsa: ");
                System.out.print("R$ ");
                valorBolsa = leitor.nextFloat();
                vbSemana4.add(valorBolsa);
                System.out.println("----------------------------------------");
                System.out.println(" ");                            
            }    
        }//Fim do la�o 
        
        //Soma dos valores da semana 1 para c�lculo da m�dia
        for(int i = 0; i < vbSemana1.size(); i++){
            mediaSemana1 += vbSemana1.get(i);
        }
        //Soma dos valores da semana 2 para c�lculo da m�dia
        for(int i = 0; i < vbSemana2.size(); i++){
            mediaSemana2 += vbSemana2.get(i);
        }
        //Soma dos valores da semana 3 para c�lculo da m�dia
        for(int i = 0; i < vbSemana3.size(); i++){
            mediaSemana3 += vbSemana3.get(i);
        }
        //Soma dos valores da semana 4 para c�lculo da m�dia
        for(int i = 0; i < vbSemana4.size(); i++){
            mediaSemana4 += vbSemana4.get(i);
        }
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        //C�lculo das m�dias semanais
        mediaSemana1 /= 7;
        mediaSemana2 /= 7;
        mediaSemana3 /= 7;
        mediaSemana4 /= 7;
        
        //Adi��o das m�dias em um novo vetor para encontar a maior e menor
        mediaDasSemanas.add(mediaSemana1);
        mediaDasSemanas.add(mediaSemana2);
        mediaDasSemanas.add(mediaSemana3);
        mediaDasSemanas.add(mediaSemana4);
        Collections.sort(mediaDasSemanas);
        
        System.out.println("As m�dias semanais das a��es foram de: " 
                + "R$ " + fmt.format(mediaSemana1) + " na 1� Semana, " 
                + "R$ " + fmt.format(mediaSemana2) + " na 2� Semana, " 
                + "R$ " + fmt.format(mediaSemana3) + " na 3� Semana, " 
                + "R$ " + fmt.format(mediaSemana4) + " na 4� Semana."); 
        
        System.out.println("Maior m�dia das a��es: " + "R$ " + fmt.format(mediaDasSemanas.get(mediaDasSemanas.size() -1)));
        
        System.out.println("Menor m�dia das a��es: " + "R$ " + fmt.format(mediaDasSemanas.get(0)));
    }//Fim da main
}//Fim da class