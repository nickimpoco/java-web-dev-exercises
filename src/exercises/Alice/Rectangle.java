package exercises.Alice;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey user, nice rectangle. How many meters long is it? You'd better use integer values.");
        Integer rectangleLength = input.nextInt();

        System.out.println("Wow, your rectangle is " + rectangleLength + " meters long. But what about the width: ");
        Integer rectangleWidth = input.nextInt();
        System.out.println("All things considered, the area of your rectangle is: " + (rectangleLength * rectangleWidth) + " meters long. Great!");
    }
}
