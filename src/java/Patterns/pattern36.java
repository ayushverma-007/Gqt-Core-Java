package java.Patterns;
import java.util.Scanner;
public class pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			for(int j=2*i-1;j>=1;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
