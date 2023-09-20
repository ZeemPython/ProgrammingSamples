import java.util.Scanner;
public class CountCode {
    public static void main(String[] aaa) {
        demo();
        Scanner input = new Scanner(System.in);
        String str1;
        String str2;
        while (true) {
            System.out.print("enter first string: ");
            str1 = input.nextLine();
            if (str1.equals(""))
                break;
            System.out.print("enter second string: ");
            str2 = input.nextLine();
            System.out.println(count(str1, str2));
        }
    }

    public static void demo() {
        System.out.println("count(\"aaacodebbb\", \"code\") " + " returns: " + count("aaacodebbb", "code"));
        System.out.println("count(\"codeaaacodebbb\", \"code\") " + " returns: " + count("codeaaacodebbb", "code"));
        System.out.println("count(\"aaaaxxxaaaa\", \"aa\") " + " returns: " + count("aaaaxxxaaaa", "aa"));
        System.out.println("count(\"ababaxaba\", \"aba\") " + " returns: " + count("ababaxaba", "aba"));
        System.out.println("count(\"abababa\", \"aba\") " + " returns: " + count("abababa", "aba"));
        System.out.println("count(\"abababa\", \"x\") " + " returns: " + count("abababa", "x"));
        System.out.println("count(\"abxabxabax\", \"x\") " + " returns: " + count("abxabxabax", "x"));
    }

    public static int count(String str, String secondString) {

        if(str.length() < secondString.length()) {
            return 0;
        }

        if(str.substring(0, secondString.length()).equals(secondString)) {
            return 1 + count(str.substring(secondString.length()), secondString);
        }

        return count(str.substring(1), secondString);
    }

}
    /*
      1. find an integer, n, that represents the problem (e.g. in
      hanoi n is the number of disks)

      2. the n that I used is an index that goes from 0 to the length
      of the str

      3. if secondString starts at index n in str, then the
      number of times secondString appears in str is 1 + the number of
      times it appears in str starting at n+1.

      4. if secondString does not start at index n in str, then the
      number of times secondString appears in str is equal to the
      number of times it appears in str starting at n+1

      Example: if n = 3, str = "aaacodeaaa", secondString = "code"
      then it is true that "code" starts at index 3 in str

      HINT:  str.startsWith(secondString, 3) returns true

    */
