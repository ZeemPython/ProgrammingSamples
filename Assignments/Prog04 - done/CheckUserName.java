import java.util.Scanner;

public class CheckUserName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a user name: ");
        String name = sc.nextLine();

        String[] employees = {"liam", "noah", "william", "james", "oliver", "elijah", "lucas", "mason", "logan", "ethan", "jacob", "michael", "henry", "jackson", "sebastian", "benjamin", "alexander", "daniel"};
        String[] admins = {"benjamin", "alexander", "daniel"};

        boolean userExists = false;

        for (int i = 0; i < employees.length; i++) {

            if (name.toLowerCase().equals(employees[i])) {

                System.out.println("welcome back: " + name);
                userExists = true;
                break;

            }
        }


        if(!userExists) {
            System.out.println("You are not a recognized user");
        }

        for (int x = 0; x < admins.length; x++) {

            if (admins[x].equals(name.toLowerCase())) {
                System.out.println("you have admin privileges");

            }
        }
    }
}
