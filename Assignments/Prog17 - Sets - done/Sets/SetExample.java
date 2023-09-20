//#######your code starts here.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
//you can change anything in this area.  If you change
//anything outside of this area the Test will fail

public class SetExample{

    static Collection<String> collec = new ArrayList<>();

    // remove duplicates by creating a new arraylist.
    static ArrayList<String> removeDupes = new ArrayList<>();
    public static void add(String str) {
        collec.add(str);

    }
    public static Collection<String> getCollection() {
        return removeDupes;
    }

    public static int getSize() {

        for (String x : collec) {

            if(!removeDupes.contains(x))
                removeDupes.add(x);

        }

        return removeDupes.size();
    }

    //declare some collection of Strings

    //write a function called add that adds Strings to the collection

    //write a function getSize that returns the number of unique
    //elements added to the collection (i.e. if you call add("the")
    //five times it counts only once)

    //write a function called getCollection that returns the
    //collection as a String

    //don't change anything outside of this area!! not even a space or
    //an empty line

    //#######your code ends here
    public static void main(String[] aaa){

        Scanner input = new Scanner(System.in);
        String str;
        while (true){
            System.out.print("enter a string: ");
            str = input.nextLine();
            if (str == "")
                break;
            add(str);

        }

        System.out.println(getSize());

        System.out.println(getCollection());

    }
}
