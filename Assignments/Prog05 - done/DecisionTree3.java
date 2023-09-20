import java.util.Scanner;

public class DecisionTree3 {
    public static void main(String[] args) {
        System.out.print("enter your credit score: ");
        Scanner scanner = new Scanner(System.in);
        int creditScore = scanner.nextInt();

        if (creditScore < 600) {
            System.out.print("do you have less than 9% delinquent payments? (y/n): ");
            String decision = scanner.nextLine();
        
            if (decision.equals("y")){
                System.out.print("have you declared bankrupcy (y/n): ");

                if (decision.equals("y")){
                    System.out.print("account declined ");
                }else
                    System.out.print("do you already have an account (y/n):");
                if (decision.equals("y")){
                    System.out.print("use existing account");
                }else{
                    System.out.print("create account");
                }
            }
        }
    }
}