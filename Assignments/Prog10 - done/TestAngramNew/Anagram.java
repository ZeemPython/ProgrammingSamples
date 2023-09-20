import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first sentence: ");
        String s1 = sc.nextLine();

        System.out.print("enter second sentence: ");
        String s2 = sc.nextLine();

        sc.close();
        System.out.print("is anagram: " );

        if(isAnagram(s1, s2))
            System.out.println("yes");
        else {
            System.out.println("no");
        }
    }

    public static boolean isAnagram(String s1, String s2) {

        boolean isAnny = false;

        char[] c1 = s1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] c2 = s2.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);

    }

}
