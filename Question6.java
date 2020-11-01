package Labs.Lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		double stateRate = 0.04;
		double countryRate = 0.02;

		double stateTax;
		double countryTax;

		double totalTax;
		double totalCost;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the purchase amount: ");
		double purchase = sc.nextDouble();

		stateTax = purchase * stateRate;

		countryTax = purchase * countryRate;

		totalTax = stateTax + countryTax;

		totalCost = purchase + totalTax;

		System.out.println("Purchase amount: $" + purchase);
		System.out.println("State tax: $" + stateTax);
		System.out.println("Country tax: $" + countryTax);
		System.out.println("Total tax: $" + totalTax);
		System.out.println("Total cost: $" + totalCost);

	}

}