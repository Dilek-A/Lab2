package Labs.Lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int variable1 = sc.nextInt();

		int min = variable1;
		int max = variable1;
		boolean anotherVariable = true;

		do {

			System.out.println("Enter next number: ");
			int variable2 = sc.nextInt();

			if (min > variable2) {
				min = variable2;
			}
			if (max < variable2) {
				max = variable2;
			}
			System.out.println("Do you wanna enter another number.0-NO,1-YES");
			int variable3 = sc.nextInt();

			if (variable3 == 0) {
				anotherVariable = false;
				break;
			}
		} while (true);

		System.out.println("The minimum number is:" + min);
		System.out.println("The maximum number is:" + max);

	}

}