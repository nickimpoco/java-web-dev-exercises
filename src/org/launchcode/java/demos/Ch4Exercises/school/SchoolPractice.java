package org.launchcode.java.demos.Ch4Exercises.school;

import org.launchcode.java.demos.Ch4Exercises.school.Student;

public class SchoolPractice {

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student zetsurin = new Student();
        zetsurin.setName("Nick");
        zetsurin.setStudentId(1337);
        zetsurin.setNumberOfCredits(1);
        zetsurin.setGpa(4.0);

        System.out.println(zetsurin.getName() + ", " + zetsurin.getStudentId()  + ", " +
                zetsurin.getNumberOfCredits() + ", " + zetsurin.getGpa());

    }
}
