package exercises.Alice;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hey user, how many miles have you driven? Give me an integer value.");
        Integer milesDriven = input.nextInt();

        System.out.println("So you've driven " + milesDriven + " miles. How many gallons of gas have you consumed?");
        Integer gallonsConsumed = input.nextInt();

        Integer milesPerGallon = (milesDriven/gallonsConsumed);
        System.out.println("Wow! Your vehicle gets " + milesPerGallon + " miles per gallon!");
    }
}
