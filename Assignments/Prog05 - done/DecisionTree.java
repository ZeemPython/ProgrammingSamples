import java.util.Scanner;

public class DecisionTree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("enter your credit score: ");
        int creditScore = sc.nextInt();


        // if the user has less than 600 cs, ask for 9% del payments
        if (creditScore < 600) {
            delinquentPayments();

            // if the user has less than 720 cs, ask for bankruptcy
        } else if (creditScore < 720) {
            declaredBankruptcy();

            // if the user has 720 cs or more,
        } else hasAccount();

    }

    /*
        Ask if the user has less than 9% delinquent payments or more.
        <9% -> ask for bankruptcy
        >=9% -> decline account.
    */
    public static void delinquentPayments() {
        System.out.print("do you have less than 9% delinquent payments? (y/n): ");
        char c = sc.next().charAt(0);

        // if user has less than 9% del. payments, ask for bankruptcy
        if (c == 'y' || c == 'Y') {
            declaredBankruptcy();

            // if user has 9% or more del payments, decline the account

        } else declineAccount();

    }

    // ask if the user has declared bankruptcy
    public static void declaredBankruptcy() {
        System.out.print("have you declared bankrupcy (y/n): ");
        char c = sc.next().charAt(0);

        // if y, decline acc
        if (c == 'y' || c == 'Y') {
            declineAccount();

            // if n, ask if they have acc
        } else {
            hasAccount();
        }

    }

    // decline the account
    public static void declineAccount() {
        System.out.print("account declined");

    }

    // ask if the user has an account
    public static void hasAccount() {
        System.out.print("do you already have an account (y/n): ");
        char c = sc.next().charAt(0);

        // if y, use curr acc
        if (c == 'y' || c == 'Y') {
            System.out.print("use existing account");

            // if n, create acc
        } else {
            createAccount();
        }


    }

    // create an account for the user
    public static void createAccount() {
        System.out.print("create a new account");

    }
}
