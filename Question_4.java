 package Lab_2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of females in the class:");
		int f=scan.nextInt();
		System.out.println("Enter number of males in the class:");
		int m=scan.nextInt();
		
		
		double perFemale, perMale;
		
		perFemale=(f*100)/(f+m);
		perMale=(m*100)/(f+m);
		
		System.out.println(perFemale);
		System.out.println(perMale);

	}

}
