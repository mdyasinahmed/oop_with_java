import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int result = a+b;
		
		System.out.println("Sum: "+result);

	}

}