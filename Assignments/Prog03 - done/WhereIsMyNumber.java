import java.util.Scanner;

public class WhereIsMyNumber {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter a number: ");
		double input = sc.nextDouble();

		if(input < 0) {
			System.out.print("number is negative");

		} else if (input >= 0 && input < 10) {

			System.out.print("number in [0,10)");

		} else if (input >= 10 && input < 100 ) {

			System.out.print("number in [10,100)");

		} else if (input >= 100 && input < 1000 ) {

			System.out.print("number in [100,1000)");

		} else {

			System.out.print("number greater than 1000");
		}

	}
}