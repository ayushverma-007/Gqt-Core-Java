package java.Patterns;
import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for(int i = 1 ; i<=n ; i++) {
			
			
			for(int j = i ; j<=n ; j++) {
				
				System.out.print(num + "  ");
				num++;
				
			}
			System.out.println();
		}

	}

}
