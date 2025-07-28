/**
 * 
 */
package Universalpattern;

import java.util.Scanner;

/**
 * 
 */
public class pattern4 {

	/**
	 * 
	 */
	public pattern4() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size : ");
				int n = sc.nextInt();
				for(int i=0;i<n;i++) {
					//A
					for(int j=0;j<n;j++) {
						if(i==0 || j==0 || i==(n/2) || j==(n-1)  ) 
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("    ");
					//Y
					
					for(int j=0;j<n;j++) {
						if(j==n/2&& i>=n/2 || i==j&& i<=n/2 || ((j+i)==n-1)&&i<=n/2 ) 
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("    ");
					
					//U
					for(int j=0;j<n;j++) {
						if(j==0 || i==(n-1) || j==(n-1) ) 
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("    ");
					
					//s
					
					for(int j=0;j<n;j++) {
						if(i==0 || i==(n-1)  || (j==(n-1)&&i>=n/2) || j==0&&i<=n/2 || i==n/2 ) 
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("    ");
					//H
					for(int j=0;j<n;j++) {
						if(j==0 || j==(n-1) || i==(n/2)  ) 
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
