package java.Patterns;

import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			
           
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            char c = (char)('A' + i - 1);
			
			for(int j=1;j<=(2*i)-1;j++) {
				
				System.out.print(c);
				
				
				
			}
			
			System.out.println();
			
			}
	}

}
