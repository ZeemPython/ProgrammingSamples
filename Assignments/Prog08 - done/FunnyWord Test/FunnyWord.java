/*/
0. prompt user for a String
1. read a String from the user
2. print whether the String is funny or not
3. continue until user enters the word "end"
 */

import java.util.Scanner;
public class FunnyWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = "";

        do {
            System.out.print("Enter a String: "); // prompt
            s = sc.nextLine().toLowerCase(); // reading & storing

            if (isFunny(s))
                System.out.println(" funny!");

            else {
                System.out.println(" that is not funny");
            }

        } while (!s.equals("end"));
    }

    public static boolean isFunny(String s) {

        String filteredString = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '.' && s.charAt(i) != ',' && s.charAt(i) != '!' && s.charAt(i) != '?' && s.charAt(i) != ':' && s.charAt(i) != ' ') {

                filteredString = filteredString + s.toLowerCase().charAt(i);
            }
        }

        String sReverse = "";
        boolean isFunny = false;

        for (int i = filteredString.length() - 1; i >= 0; i--) {
            sReverse = sReverse + filteredString.toLowerCase().charAt(i);
        }

        if (filteredString.equalsIgnoreCase(sReverse)) {
            isFunny = true;
        }

        return isFunny;
    }
}
