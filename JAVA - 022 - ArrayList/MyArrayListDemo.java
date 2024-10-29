/*
*  JAVA - 022 - ArrayList
*
*@author Henrique Fernandes Cassoli
*/

import java.util.ArrayList;

public class MyArrayListDemo{
   public static void main(String[] args){
       ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars.toString());
   }  
}