package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("User, declare the radius of your circle.");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double Area = Circle.getArea(radius);

        System.out.println("The area of a circle given a radius " + radius + " is " + Area + ".");
    }
}
