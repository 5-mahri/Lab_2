package Lab_2;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double mealCharge;
		final double tax = 0.0675;
		double taxAmount;
		double totalWithTax;
		final double tip = 0.20;
		double tipAmount;
		double totalBill;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the charge for your meal $");
		mealCharge = keyboard.nextDouble();
		keyboard.nextLine();
		
		taxAmount = mealCharge * tax;
		totalWithTax = mealCharge + taxAmount;
		tipAmount = totalWithTax * tip;
		totalBill = totalWithTax + tipAmount;
		
		System.out.println("Your meal charge amount is $" + mealCharge + ".");
		System.out.println("Your tax amount is $" + taxAmount + ".");
		System.out.println("Your tip amount is $" + tipAmount + ".");
		System.out.println("-----------------------------------");
		System.out.println("Your total bill amount is $" + totalBill + ".");
				
		
	

	}

}
