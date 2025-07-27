package Scanner;
import java.util.Scanner;
public class NonPremitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Byte = ");
		Byte b = new Byte(sc.nextByte());
		System.out.println("You Enter Byte = "+b);
		
		System.out.print("Enter short = ");
		Short s = new Short(sc.nextShort());
		System.out.println("You Enter Short = "+s);
		
		System.out.print("Enter Integer = ");
		Integer i = new Integer(sc.nextInt());
		System.out.println("You Enter Int = "+i);
		
		System.out.print("Enter Long = ");
		Long l = new Long(sc.nextLong());
		System.out.println("You Enter long = "+l);
		
		System.out.print("Enter Float = ");
		Float f = new Float(sc.nextFloat());
		System.out.println("You Enter Float = "+f);
		

	}

}
