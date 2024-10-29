/**
*JAVA - 011 - Entrada de Dados com Scanner
*
*@author Henrique Cassoli
*/
import java.util.Scanner;

public class Entrada{

     public static void main(String[] args){
		 //chamada do programa
		 //System.out.println(args[0]);
		 
		 //Integagindo com úsuario
			Scanner scan = new Scanner(System.in);
			String entrada = scan.nextLine();
			System.out.println("Você digitou: " + entrada);
	 }
}