package Scanner;
import java.util.Scanner;
public class PremitiveDataType {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Byte = ");
		Byte b = sc.nextByte();
		System.out.println("You Enter Byte = "+b);
		
		
		System.out.print("Enter short = ");
		Short s = sc.nextShort();
		System.out.println("You Enter Short = "+s);
		
		System.out.print("Enter Integer = ");
		Integer i = sc.nextInt();
		System.out.println("You Enter Int = "+i);
		
		System.out.print("Enter Long = ");
		Long l = sc.nextLong();
		System.out.println("You Enter long = "+l);
		
		System.out.print("Enter Float = ");
		Float f = sc.nextFloat();
		System.out.println("You Enter Float = "+f);
	
	}
}
