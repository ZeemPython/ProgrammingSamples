import java.util.Scanner;

public class LoopString{

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("enter a String: ");
		String s = scan.nextLine();

		for(int i = 0; i < s.length(); i++) {
			
			System.out.println(s.charAt(i));
	  		
	  	}

	  	
   }
}