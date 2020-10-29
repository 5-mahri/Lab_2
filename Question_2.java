package Lab_2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// in 1 bag 40 cookies
		// in bag 10 serving 40/10=4 in each serving has 4 cookies=300 calories
		// each cookie has 300/4=75 calories
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of cookies");
		int cookies=scan.nextInt();
		
		int calories=cookies*75;
		System.out.println(calories);

	}

}
