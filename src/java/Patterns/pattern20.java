package java.Patterns;
import java.util.Scanner;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int col  = n*2;
		
		for(int i = 1 ; i<=n ; i++) {
			
			
			
			for(int j = 1 ; j<=col; j++) {
				if(j<=n) {
					System.out.print("-");
				}
				
				else {
				System.out.print("@");
				
				}
				
			}
			System.out.println();
		}
		

	}

}
