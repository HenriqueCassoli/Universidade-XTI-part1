/*
*JAVA - 019 - Desafio do Cálculo do IMC
*
*@author Henrique Fernandes Cassoli
*/

import java.util.Scanner;


public class IMC{

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("qual é sua peso ?");
		double peso = scan.nextDouble();
		
		System.out.println("qual é sua aultura ?");
		double altura = 1.69;
		
		double IMC = peso / (altura * altura);
		
		System.out.println("Seu IMC é "+IMC);
	}
}