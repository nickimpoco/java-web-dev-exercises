package exercises.Alice;
import java.util.Scanner;
public class Arisu {
    public static void main(String[] args) {
        String arisuOne = "\n"+"Alice was beginning to get very tired of sitting by her sister on the bank, "
                + "and of having nothing to do: once or twice she had peeped into the book her sister was reading, "
                + "but it had no pictures or conversations in it, 'and what is the use of a book,' "
                + "thought Alice 'without pictures or conversation?'\n";
        System.out.println("User, enter a term and I will search to see if it is written " +
                "in the first sentence of Alice's Adventures in Wonderland: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine().toLowerCase();
        System.out.println("User, it is " + arisuOne.toLowerCase().contains(userInput) + " that your queried term appears.");
        System.out.println("Okay user, that's great but let's make this exercise a little more spicy. " +
                "Choose another word: ");
        Scanner inputTwo = new Scanner(System.in);
        String userInputTwo = inputTwo.nextLine().toLowerCase();
        input.close();
        System.out.println("User, your second word is found at index " + arisuOne.indexOf(userInputTwo) + "." +
                " Now I'm going to do a magic trick and make your word disappear!");
        String arisuMagic = arisuOne.replace(userInputTwo, "");
        System.out.println("Ta-da! I've rewritten Alice's Adventures in Wonderland without your word: \n\n" + arisuMagic);
    }
}
