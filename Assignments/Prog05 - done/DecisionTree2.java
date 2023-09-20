import java.util.Scanner;

public class DecisionTree {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter your credit score: ");
        int creditScore = sc.nextInt();


        // if the user has less than 600 cs, ask for 9% del payments
        if (creditScore < 600) {
            
            System.out.print("do you have less than 9% delinquent payments? (y/n): ");
            String answer = sc.nextLine();

            // if del payments is less than 9%
            if (answer.equals("y")) {
            	System.out.print("have you declared bankrupcy (y/n): ");

            	// if user declared bankruptcy
            	if(answer.equals("y")) {

            		System.out.print("account declined");

            	// if user has not declared bnkrupt, ask if they have account
            	} else 

            		System.out.print("do you already have an account (y/n): ");

            		// ask if user has account y/n
            		if()



            // if del payments 9% or more
            } else

            	System.out.print("account declined");
            }






            // if the user has less than 720 cs, ask for bankruptcy
        } else if (creditScore < 720) {
            

            // if the user has 720 cs or more,
        } else 




	}

}