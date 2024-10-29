/*
*JAVA - 025 - Desafio dos Dados
*
*@author Henrique Fernandes Cassoli
*/

import java.util.Scanner;
import java.util.Random;

public class Fluxo{

     public static void main(String[] args){
	     
	      Scanner scan = new Scanner(System.in);
		  System.out.println("Qual o seu palpite");
	      int palpite = scan.nextInt();
		  
		  Random n = new Random();
		  int dado =n.nextInt(6)+1;
		  
		  if(palpite == dado){
			  System.out.println("Acertou");
		  }else{
			  System.out.println("errou");
		  }
	 
	 }

}