package java.Patterns;

import java.util.Scanner;

public class pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// Generate the pyramid pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces for centering
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
           int numChars = 2 * i + 1; 
            char startChar = (char) ('A' + numChars - 1);
            
            for (int j = 0; j < numChars; j++) {
                System.out.print((char) (startChar - j));
            }
            
            System.out.println();
        }
	        
	}

}
