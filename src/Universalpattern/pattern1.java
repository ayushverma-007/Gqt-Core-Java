/**
 * 
 */
package Universalpattern;

import java.util.Scanner;

/**
 * 
 */
public class pattern1 {

	/**
	 * 
	 */
	public pattern1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0 ; i<n ;i++) {
			for(int j = 0 ; j<n; j++) {
				if(i == 0|| i==(n-1) || j==0 ||j==(n-1)||i==(n/2)||j==(n/2)||i==j||i+j==(n-1)||j-i==(n/2)||i+j==(n-1)+(n/2)||i-j==(n/2)||i+j==(n/2)) {
				System.out.print("# ");}
				else {
					System.out.print("- ");
				}
			}System.out.println();
		} 
	}

}
