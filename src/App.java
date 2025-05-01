
/**
    * You are going to write code to store a list of participant names for a 
    * local event. You will create an ArrayList for Strings, then accept user 
    * input to add names to that ArrayList. There will be additional modifications 
    * you can make:

    * B Level:
    * Accept input from users and add names to the ArrayList.

    * B+ Level:
    * Accept names from users and stop accepting input when the user enters "end". 
    * After this, the full list of names should be printed, one name per line.

    * A- Level:
    * Complete B and B+. Additionally, do not allow duplicates. If the user enters a 
    * name that already exists, tell them that the name has already been entered, but 
    * continue accepting new names.

    * A+ Level:
    * Complete B and B+. Modify A- so that when a duplicate name is entered, the user 
    * is asked whether they want to delete the existing name. If they enter "yes", the 
    * name is removed from the list. If they type anything else, the duplicate name is 
    * ignored, and no change is made to the list.
*/
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter your name: ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                names.add(input);
                System.out.println(names);
                break;
            }
            System.out.println(names);

            if (names.contains(input)) {
                System.out.println("Enter a different name, name already entered ");
                System.out.println("Do you want to delete the existing name; enter yes or no");
                String delete = scanner.nextLine();
                if (delete.equals("yes")) {
                    names.remove(input);
                    int indexLocation = names.indexOf(input);
                } else {
                    names.add(indexLocation);
                }

            }
            names.add(input);
        }
            System.out.println("");
            for (int i = 0; i < names.size(); i++) {

                System.out.println(names.get(i));
               
            }

        scanner.close();
    }
}