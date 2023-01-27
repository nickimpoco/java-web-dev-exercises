package chapter.three.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import chapter.three.exercises.ArrayListPractice;

public class ArrayPractice {
    public static void main(String[] args) {
        //integer array list exercise
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);

        for (int i : intList) {
            System.out.println(i);
        }
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        System.out.println(sumEven(intList));


        //string array list practice
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Bike","Train","Sidewalk"));
        strList.add("Subway");
        strList.add("Books");
        strList.add("Bus");
        strList.add("Snack");

        System.out.println(fiveChars(strList));

        System.out.println(numChars(strList));

        //bonus arraylist
        ArrayListPractice arrayListPracticeObject = new ArrayListPractice();
        String seussString = arrayListPracticeObject.seussStr;
        ArrayList<String> seussList = new ArrayList<>(Arrays.asList(seussString.split(" ")));

        System.out.println(seussChars(seussList));
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (i%2==0){
            sum+=i;
            }
        }
        return sum;
    }
    public static String fiveChars(ArrayList<String> arr){
        String concat = "";
        for (String i : arr){
            if (i.length()==5){
                concat += "\n"+i;
            }
        }
        return concat;
    }
    public static String numChars(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        String concat = "";
        System.out.println("User, choose your ideal word length: ");
        int userNum = input.nextInt();
        for (String i : arr) {
            if (i.length() == userNum) {
                concat += "\n" + i;
            }
        }
        return concat;
    }
    public static String seussChars(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        String strTotal = "";
        System.out.println("User, choose your ideal word length: ");
        int userNum = input.nextInt();
        for (String i : arr) {
            if (i.length() == userNum) {
                strTotal += "\n" + i;
            }
        }
        return strTotal;
    }
}
