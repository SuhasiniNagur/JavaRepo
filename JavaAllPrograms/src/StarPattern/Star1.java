package StarPattern;

public class Star1 {

	
	public static void main(String[] args) {

		//i for rows and j for columns      
				//row denotes the number of rows you want to print  
				int i, j, row=6;   
				//outer loop for rows  
				for(i=0; i<row; i++)   //i=1
				{   
				//inner loop for columns  
				for(j=0; j<=i; j++)   
				{   
				//prints stars   
				System.out.print("* ");   
				}   
				//throws the cursor in a new line after printing each line  
				System.out.println();   
	}

	}

}
