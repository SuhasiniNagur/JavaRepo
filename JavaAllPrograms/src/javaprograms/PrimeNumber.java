package javaprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		int temp = 0;
		for(int i=2;i<num-1;i++) {  
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
	}

}
