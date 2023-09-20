
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CharsInCommon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first word: ");
        String s1 = sc.nextLine();

        System.out.print("enter second word: ");
        String s2 = sc.nextLine();
        sc.close();

        System.out.println("count: " + combineStrings(s1, s2));

    }

    public static int combineStrings(String word1, String word2) {

        String allCommons = "";

        // combine strings and filter out all common values into a new array: allCommons
        for (int x = 0; x < word1.length(); x++) {

            for (int d = 0; d < word2.length(); d++) {

                if (word1.charAt(x) == word2.charAt(d))
                    allCommons += word1.charAt(x);
            }
        }

        for (int i = 0; i < allCommons.length(); i++) {

            String charToRemove = allCommons.charAt(i) + "";

            word1 = word1.replace(charToRemove, "");
            word2 = word2.replace(charToRemove, "");

        }

        //
        boolean[] charSearch = new boolean[500];
        for (int i = 0; i < allCommons.length(); i++) {

            charSearch[allCommons.charAt(i)] = true;

        }

        int count = 0;

        for (int i = 0; i < charSearch.length; i++) {

            if (charSearch[i] == true) {
                count++;
            }
        }

        return count;

    }

}