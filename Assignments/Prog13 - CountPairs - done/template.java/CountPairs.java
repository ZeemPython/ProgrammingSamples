import java.util.Scanner;
public class CountPairs{

    public static int countPairs(String str){
        if (str.length() < 3)
            return 0;
        else if (str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));
        else
            return countPairs(str.substring(1));
    }
    
    public static void main(String [] aaa){
        Scanner input = new Scanner(System.in);
        String str;
        while(true){
            System.out.print("enter a string: ");
            str = input.nextLine();
            if (str.equals(""))
                break;
            System.out.println("nr of pairs: " + countPairs(str));
        }
    }
}
