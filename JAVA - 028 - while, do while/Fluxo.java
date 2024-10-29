/*
* JAVA - 028 - while, do while
*
*@author Henrique Fernandes Cassoli
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Fluxo{
    public static void main(String[] args){
      Scanner scan  = new Scanner(System.in);
      //FLUXO DE REPETIÇÃO
	  
	  ArrayList<String> produtos = new ArrayList<String>();
	  System.out.println("Liste seus produtos au sair digite FIM");
	 
	 String produto;
	 
	 while(!"FIM" .equals(produto = scan.nextLine())){
		 produtos.add(produto);
	 }
	 
	 System.out.println(produtos.toString());
    }

}