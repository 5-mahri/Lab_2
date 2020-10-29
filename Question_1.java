package Lab_2;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scan.nextInt();
		int min = num1;
		int max = num1;
		boolean anotherNumber = true;
		do {
			System.out.println("Enter the next number:");
			int num2 = scan.nextInt();
			if (min > num2) {
				min = num2;
			}
			if (max < num2) {
				max = num2;
			}
			System.out.println("Do you want to put another number. 0-no, 1-yes");
			int num = scan.nextInt();
			if (num == 0) {
				anotherNumber = false;
				break;
			}
		} while (true);
		System.out.println("The smallest number is:" + min);
		System.out.println("The largest number is:" + max);

	}

}
