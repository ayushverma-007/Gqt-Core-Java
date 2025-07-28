/**
 * 
 */
package Universalpattern;

import java.util.Scanner;

/**
 * 
 */
public class pattern5 {

	/**
	 * 
	 */
	public pattern5() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			//G
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || (i==n-1&& j<=n/2) || j==n/2&&i>=n/2 || i==n/2&&j>=n/2 || j==n-1&&i>=n/2 )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//O
		for(int j=0;j<n;j++) {
			if( j==0 || i==0 || i==n-1 ||j==(n-1) ) 
			{
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("    ");
		
		//O
		for(int j=0;j<n;j++) {
			if( j==0 || i==0 || i==n-1 ||j==(n-1) ) 
			{
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("    ");
		
		for(int j=0;j<n;j++) {
			if( j==0 || i==0 || i==n-1 ||j==(n-1) ) 
			{
				System.out.print("* ");
			}
			
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	
	}
	}
}
