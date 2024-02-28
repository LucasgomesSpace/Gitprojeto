package Atividades;
import java.util.Scanner;
public class Atividade_2 {

	public static void main(String[] args) {
		double HT,VH,SB, SL, Inss; 

		Scanner ler = new Scanner(System.in);
		System.out.println("Quantas horas foram trabalhadas: "); 

		HT = ler.nextDouble(); 

		System.out.println("Qual o valor da sua hora de trabalho : ");
		VH = ler.nextDouble();

		SB = HT*VH; 

		Inss = SB * 0.12 ;

		SL = SB - Inss; 

		System.out.println (" O valor do salario bruto é:" + SB +" e " + "Valor liquido: " + SL ); 









	}

}
