package java.Patterns;
import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<n ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
