package java.Patterns;
import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n*n;
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<n ; j++) {
				System.out.print(num );
				num--;
			}
			System.out.println();
		}
	}

}
