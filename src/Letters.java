import java.sql.Struct;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int index = 0;
        String userResponse;
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l",
        "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        do {
            System.out.println("Enter the length of the word");

            int word = keyboard.nextInt();

            String newWord = "";
            for (int x = 1; x <= word; x++) {
                index = rand.nextInt(letters.length);
                newWord += letters[index];

            }
            if (newWord.contains("a") || newWord.contains("i") || newWord.contains("e") || newWord.contains("o")
                    || newWord.contains("u")) {
                System.out.println(newWord + " Might be a word!");
            } else {
                System.out.println(newWord + " it is not a word");
            }

            System.out.println("Would you like to get an word? y/n");
            userResponse = keyboard.next();
        }while (!userResponse.equalsIgnoreCase("n"));
    }
}
