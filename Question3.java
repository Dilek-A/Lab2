package Labs.Lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);

	}

}
