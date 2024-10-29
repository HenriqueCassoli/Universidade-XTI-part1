/*
*JAVA - 027 - foreach
*
*@author Henrique Fernandes Cassoli
*/

import java.util.ArrayList;

public class Fluxo{

  public static void main(String[] args){
  
      /*foreach*/
	  
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  
	  for(int i = 0;i<10;i++){
		  list.add(i);
	  }
	  
	  for(Integer numero : list){
		  System.out.println(numero);
	  }
	  
	  
  }


}