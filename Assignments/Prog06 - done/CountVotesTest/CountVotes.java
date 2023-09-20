import java.util.Scanner;

public class CountVotes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.next());

        do {
            sc.nextLine(); //needs this because it uses the next string (blank) as input
            String name = sc.nextLine();

            String votes = sc.nextLine();

            String[] arr = votes.split(" ");


            int votesSum = 1;

            for (int i = 0; i < arr.length; i++) {
                votesSum += Integer.parseInt(arr[i]);
                if (arr[i].equals("-1")) {

                    System.out.println(id + " " + name + " " + votesSum);
                    break;
                }

            }
            id = Integer.parseInt(sc.next());
        } while (id != -1);

        //System.out.println(-1);

    }
}