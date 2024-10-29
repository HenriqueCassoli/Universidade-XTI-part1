/*
*JAVA - 029 - Fibonacci
*
*@author Henrique Fernandes Cassoli
*/

import java.util.ArrayList; 

public class Fluxo{
   public static void main(String[] args){
      ArrayList<Integer> fibonacci = new ArrayList <Integer>();
	  
	  // Inicializando os dois primeiros números da sequência
        fibonacci.add(0);
        fibonacci.add(1);
	  
	  int num;
	  
	  for(int i =2;i <= 50;i++){
		  num = (i - 2) + (i - 1);
		  fibonacci.add(num);
	  }
	  
	 
        System.out.println(fibonacci);
      
   }

}