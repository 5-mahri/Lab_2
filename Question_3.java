package Lab_2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number (positive):");
		int num=scan.nextInt();
		int sum=0;

		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
