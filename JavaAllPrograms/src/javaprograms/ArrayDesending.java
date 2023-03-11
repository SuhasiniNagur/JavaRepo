package javaprograms;

import java.util.Scanner;

public class ArrayDesending {
	
	public static void main(String[] args) {
		//Create object of scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n= sc.nextInt();
		
		//Declare and initialize Array and other Required variables..
		
		int a[] = new int [n];//n=3
		int i,j,temp=0;
		
		//Now get all array elements from user
		
		System.out.println("Enter " + n +" number of array elements:  ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//Print all array elements
		
		System.out.println("All array elements are: ");
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}
		
		//Now arrange array elements in ascending order
		
		for(i=0;i<n;i++) {//i=2
			for(j=i+1;j<n;j++) {//j=2
				if(a[i]<a[j]) {//6>1
					temp=a[i];//6
					a[i]=a[j];//1
					a[j]=temp;//6
				}
			}
		}
		
		//Print array in ascending order...
		System.out.println("\nArray Elements in Desending Order: ");
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}
	}
}
