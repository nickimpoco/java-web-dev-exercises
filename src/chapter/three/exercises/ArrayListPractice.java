package chapter.three.exercises;

import java.util.Arrays;

public class ArrayListPractice {


    public static String seussStr = "I would not, could not, in a box. " +
            "I would not, could not with a fox. I will not eat them in a house. " +
            "I will not eat them with a mouse.";
    public static void main(String[] args) {
       /* int[] someArray = {1, 1, 2, 3, 5, 8};
        for (int i : someArray){
            System.out.println(i);
        }*/
       /* String seussStr = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";*/

        String[] hamArray = seussStr.split("\\.");
        //System.out.println(greenEggs);
        System.out.println(Arrays.toString(hamArray));
    }
}