/*
*Entrada Gráfica de Dados com JOptionPane
*
*@author Henrique Cassoli 
*/

import javax.swing.JOptionPane;

public class Entrada{

  public static void main(String[] args){
  
    String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
	
	System.out.println(nome);
  
  }
}