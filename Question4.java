package Labs.Lab2;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);
	 

	 System.out.println("Please enter the number of males");


	 int number_of_males = input.nextInt();

	 System.out.println("Please enter the number of females");

	 
	 int number_of_females = input.nextInt();
	 int total = number_of_males + number_of_females;
	 
	 double percentagemales = (double) number_of_males / total * 100.0;
     double percentagefemales = (double) number_of_females / total * 100.0;


	 System.out.println("Percentage males : " + percentagemales + "%");

	 System.out.println("Percentage females : " + percentagefemales + "%");

	}
	
}



	
