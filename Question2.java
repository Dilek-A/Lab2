package Labs.Lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalNumberOfCookies = 40;
		int servings = 10;
		int caloriesPerServing = 300;

		System.out.println("How many cookies did you eat?");
		int cookies = sc.nextInt();

		int cookiesPerServing = totalNumberOfCookies / servings;

		int caloriesPerCookie = caloriesPerServing / cookiesPerServing;

		System.out.println(
				"You ate " + cookies + " cookies and you consumed " + caloriesPerCookie * cookies + " calories");

	}

}