package Atividades;
import java.util.Scanner; 
 public class Atividade_1{
	 
	public static void main(String[] args ){

		String nome, idade;
	    
	    Scanner ler = new Scanner(System.in); 
	    System.out.println("Informe seu nome : ");
	    
	     nome = ler.next(); 
	     
		    System.out.println("Infrome sua idade: ");
	     
	    idade = ler.next();
	    
	    System.out.println ("nome: " + nome +"  " + "idade: " + idade + " " +"Anos");
	}

}
