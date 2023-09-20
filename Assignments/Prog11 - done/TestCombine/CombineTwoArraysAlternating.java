import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineTwoArraysAlternating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split("\\s+");
        String[] arr2 = sc.nextLine().split("\\s+");

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }

        List<String> list3 = new ArrayList<>();

        int counter = 0;


        // combine lists
        while (counter < list1.size() || counter < list2.size()) {

            if (counter < list1.size())
                list3.add(list1.get(counter));

            if (counter < list2.size())
                list3.add(list2.get(counter));

            counter++;
        }

        if (list1.contains("") && (list2.contains(""))){
            list3.remove(1);
            System.out.println("list1: " + list1);
            System.out.println("list2: " + list2);
            System.out.println(list3);

        } else if (list1.contains("")) {
            list3.remove(0);
            System.out.println("list1: " + list1);
            System.out.println("list2: " + list2);
            System.out.println(list3);

        } else if (list2.contains("")) {
            list3.remove(1);
            System.out.println("list1: " + list1);
            System.out.println("list2: " + list2);
            System.out.println(list3);
            
        } else {
            System.out.println("list1: " + list1);
            System.out.println("list2: " + list2);
            System.out.println(list3);
        }


        //list3.replaceAll();

    }
}

/*
  if (list1.size() == 0) {

            System.out.println("list1: [ ");

        } else {

            System.out.print("list1: [");

            for (int i = 0; i < list1.size(); i++) {

                if (i == list1.size() - 1) {
                    System.out.print(list1.get(i));
                    break;
                }
                System.out.print(list1.get(i) + ", ");
            }
            System.out.print("]\n");
        }



        if (list2.size() == 1) {
            System.out.println("list2: [ ");

        } else {
            System.out.print("list2: [");

            for (int i = 0; i < list2.size(); i++) {

                if (i == list2.size() - 1) {
                    System.out.print(list2.get(i));
                    break;
                }
                System.out.print(list2.get(i) + ", ");
            }

            System.out.print("]\n");
        }
 */

