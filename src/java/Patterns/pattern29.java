package java.Patterns;

import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 for (int i = 1; i <= n; i++) {
	           
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	           
	            for (int j = i; j >= 1; j--) {
	                char letter = (char)('A' + j - 1);
	                System.out.print(letter);
	            }
	            for (int j = 2; j <= i; j++) {
	                char letter = (char)('A' + j - 1);
	                System.out.print(letter);
	            }
	            
	            System.out.println();
	        }
	        
	}

}
